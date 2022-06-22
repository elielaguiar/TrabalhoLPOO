package Livro;
import Pessoa.Autor;

public class Cientifico extends Livro {
    private String especialidade;
    private String area ;
    private String orgao;

    public Cientifico(String nome, String editora, int quantidade,double preco, Autor autor,String esp, String area,String orgao){
        super(nome, editora, quantidade,preco, autor);
        this.especialidade = esp;
        this.area = area;
        this.orgao = orgao;

    }

    public String getArea() {
        return area;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getOrgao() {
        return orgao;
    }



    public String getFicTecnica() {
        return super.getFicTecnica() + "\nAutorizada a venda pela : "+getOrgao()+"\nEspecialidade: "+ getEspecialidade() + "\nArea de atuação: "+ getArea()+"\n";
    }
}
