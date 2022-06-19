package Pessoa;
import java.util.ArrayList;
import java.util.List;

import Livro.Livro;

public class Cliente extends Pessoa {

    private List <Livro> livros = new ArrayList <>(); // livros comprados
    private int telefone;

    //public boolean emiteNota();
    //public boolean compra(); 


    public Cliente(String nome, String CPF, String dataNasc){
        super(nome, CPF,dataNasc);      
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    

    public void add(Livro livro){
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public String toString() {
        String b  = super.toString()+"\nTelefone:"+getTelefone();
        System.out.println("Livros comprados por : "+getNome()+"\n");
        for (Livro livro : livros) {

            System.out.println(livro.getFicTecnicaBusca());
        }
        return b;
    }

    
}


