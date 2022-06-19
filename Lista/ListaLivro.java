package Lista;
import java.util.ArrayList;
import java.util.List;

import Livro.Livro;
import Pessoa.Autor;

public class ListaLivro {
    List <Livro> livros = new ArrayList<>();
    List <Livro> livrosVazios = new ArrayList<>();

    public boolean add(Livro obj){
        boolean valor = false;
        if(!valor){
            livros.add(obj);
            listaAutor(obj.getAutor(), obj);
        }
            
        return valor;
    }

   public boolean compara(Livro qualquer){
    boolean valor = false;
    for (Livro livro : livros) {
        if(livro.equals(qualquer))
            valor = true;
    }
    for (Livro livro : livrosVazios) {
        if(livro.equals(qualquer))
            valor = true;
    }
    return valor;
   }


   private void listaAutor(Autor qualquer,Livro livro){
    qualquer.addLivro(livro);
   }

   private void livrosVazios(Livro qualquer){
    if(qualquer.getQuantidade() == 0){
        livrosVazios.add(qualquer);
        livros.remove(qualquer);
    }
   }

   public void BuscarNome(String nome){
    boolean valor = false;
    for (Livro livro : livros) {
        if(livro.getNome().contains(nome.toUpperCase())){
            valor = true;
            System.out.println(livro.getFicTecnica());
        }
    }
    if(!valor){
        System.out.println("Nenhum cadastro encontrado");
    }

   }

   public void BuscarAutor(String nomeAutor){
    boolean valor = false;
    for (Livro livro : livros) {
        if(livro.getAutor().getNome().contains(nomeAutor.toUpperCase())){
            System.out.println(livro.getFicTecnica());
        }
    }
    if(!valor){
        System.out.println("Nenhum cadastro encontrado");
    }
   }

   public Livro BuscarISBN(String IBSN){
    Livro valor = null;
    for (Livro livro : livros) {
        if(livro.getISBN().contains(IBSN.toUpperCase())){
            valor = livro;
        }
    }
    return valor;
    }




    



    
}
