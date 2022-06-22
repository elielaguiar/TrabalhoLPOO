package Pessoa;


import java.util.ArrayList;
import java.util.List;

import Livro.Livro;

public class Autor extends Pessoa {
    private int qtdPublicados = 0;
    private String tipoGenero;
    private List<Livro> livrospublicados = new ArrayList<>();
    private static int id  = 1000;
    private int  cod ;

    public Autor(String nome, String CPF, String tipoGenero,String nasc){
        super(nome, CPF,nasc);
        this.tipoGenero = tipoGenero;
        setId();
    }

    public Autor(Cliente cliente, String tipoGenero){
        super(cliente.getNome(),cliente.getCPF(),cliente.getDataNasc());
        this.tipoGenero = tipoGenero;
        setId();
    }

    

    public int getPublicados(){
        return qtdPublicados;
    }

    public String getGenero(){
        return tipoGenero;
    }

    private void setId() {
       this.cod = id;
       id ++;
    }

    public  int getCod() {
        return cod;
    }

   
    public String toString() {
        System.out.println("Livros escritos: ");
        for (Livro livro : livrospublicados) {
            System.out.println(livro.getFicTecnica());
        }
        return super.toString()+"\nGênero:"+getGenero()+"\nCódigo:"+getCod()+"\n";
    }

    public void addLivro(Livro qualquer){
        qtdPublicados ++;
        livrospublicados.add(qualquer);
        
    }

    public List<Livro> getLivrospublicados() {
        return livrospublicados;
    }
        

}
