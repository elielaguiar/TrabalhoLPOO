package Lista;
import java.util.ArrayList;
import java.util.List;

import Livro.Livro;
import Pessoa.Autor;
import Pessoa.Pessoa;

public class ListaAutor extends Generico{

    private List<Autor> autores = new ArrayList<Autor>();
    private Autor aux;

    public void add(Autor obj) {
        autores.add(obj);
    }

   public boolean compara(String cpf) {
       return super.compara(cpf, autores);
   }

   public void Buscar(String nome) {
       super.Buscar(nome, autores);
   }

    public void BuscarCPF(String cpf) {
        Pessoa a  = super.BuscarCPF(cpf, autores);
        
    }

    public Autor BuscarCod(String cod){
        for (Autor autor : autores) {
            if(autor.getCod().contains(cod))
                return autor;
        }
        return null;
    }

    public void ImprimeAutor() {
        for (Autor autor : autores) {
            System.out.println(autor.toString());
            List<Livro> livros = autor.getLivrospublicados();
            for (Livro livro : livros) {
                livro.getFicTecnica();
            }
        }
    }

}
