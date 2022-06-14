public class Ficcao  extends Livro{
    private String genero;

    Ficcao(String nome, String editora,int ISBN,int anoPublicacao, int quantidade,double preco,int paginas,String genero){
        super(nome,editora,ISBN,anoPublicacao,quantidade,preco,paginas);
        this.genero = genero;
        String tipo = "Ficção -"+genero;
        setTipo(tipo);
        
    }

    public void setDescricao(String msn){
        msn = msn+"\nNão cientifico\nGênreo:"+genero;
        setDescricao(msn);
    }



    public String getGenero(){
        return genero;
    }
}
