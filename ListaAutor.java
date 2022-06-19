import java.util.ArrayList;
import java.util.List;

public class ListaAutor {

    private List<Autor> autores = new ArrayList<Autor>();
    private Autor aux;

    public void add(Autor obj) {
        autores.add(obj);
    }

    public boolean comparaAutor(String cpf) {
        boolean valor = false;
        for (Autor autor : autores) {
            if (autor.getCPF().contains(cpf))
                valor = true;
        }
        return valor;
    }

    public void Buscar(String nome) {
        boolean valor = false;
        for (Autor autor : autores) {

            if (autor.getNome().toUpperCase().contains(nome.toUpperCase())) {
                System.out.println(autor);
                valor = true;
            }
        }
        if (!valor)
            System.out.println("Nenhum registro,encontrado");
    }

    public void BuscarCPF(String cpf) {
        boolean valor = false;
        for (Autor autor : autores) {
            if (autor.getCPF().contains(cpf)) {
                System.out.println(autor);
                valor = true;
            }
        }
        if (!valor) {
            System.out.println("Nenhum registro encontrado");
        }
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
        }
    }

}
