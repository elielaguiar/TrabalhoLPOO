public class Cientifico extends Livro {
    private String especialidade;
    private String area ;
    private String orgao;


    public String getArea() {
        return area;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getOrgao() {
        return orgao;
    }


    public Cientifico(String nome, String editora,int ISBN,int anoPublicacao, int quantidade,double preco,int paginas,String especialidaString){
        super(nome,editora,ISBN,anoPublicacao,quantidade,preco,paginas);
        super.setTipo("Cientifico"+especialidaString);
    }

    public String getFicTecnica() {
        return super.getFicTecnica() + "\nAutorizada a venda pela"+getOrgao();
    }
}
