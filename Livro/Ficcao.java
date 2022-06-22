package Livro;
import Pessoa.Autor;

public class Ficcao  extends Livro{
    private String genero;
    private String descricao;

    public Ficcao(String nome, String editora, int quantidade,double preco, Autor autor,String genero, String descricao){
        super(nome, editora, quantidade,preco, autor);
        this.descricao = descricao;
        this.genero = genero;

    }

    public String getDescricao() {
        return descricao;
    }

    public String getGenero(){
        return genero;
    }

    public String getFicTecnica() {
        return super.getFicTecnica()
        +"\nDescrição: "+getDescricao()+"\nGênero: "+getGenero()+"\n";
    }
}
