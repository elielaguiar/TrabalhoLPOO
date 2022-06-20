package Pessoa;
import java.util.ArrayList;
import java.util.List;

import Livro.Livro;

public class Cliente extends Pessoa {

    private List <Livro> livros = new ArrayList <>(); // livros comprados
    private String telefone;

    public Cliente(String nome, String CPF, String dataNasc,String telefone){
        super(nome, CPF,dataNasc);
        this.telefone = telefone;      
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    

    public void add(Livro livro){
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public String toString() {
        String b  = super.toString()+"\nTelefone:"+getTelefone()+'\n';
        System.out.println("Livros comprados por : "+getNome()+"\n");
        for (Livro livro : livros) {

            System.out.println(livro.getFicTecnicaBusca());
        }
        return b;
    }

    
}


