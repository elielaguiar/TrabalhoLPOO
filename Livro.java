abstract public class Livro {
    private String nome;
    //private Autor autor; implementar a classe
    // criar lista de espera 
    private String editora;
    private int ISBN;
    private int anoPublicacao;
    private String tipo; // não vai ser no construtor
    private int quantidade;
    private int volume;
    private String descricao; // implementado na abstração, não precisa ser no construtor
    private double preco;
    private int paginas;

    Livro(String nome, String editora,int ISBN,int anoPublicacao, int quantidade,double preco,int paginas){
        this.nome = nome;
        this.editora = editora;
        this.ISBN = ISBN;
        this.anoPublicacao = anoPublicacao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.paginas = paginas;
    }

    public String getNome(){
        return nome;
    }

    Livro(String nome){
        this.nome = nome;
    }

    // falta implementar a classe autor e seu get;


    public String getEditora(){
        return editora;
    }

    public int getISBN(){
        return ISBN;

    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double novoPreco){// mudança de preço
        this.preco = novoPreco;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
        
    }


    public String getDescricao(){
        return descricao;
    }

    protected void setDescricao(String msn){
        descricao = msn;
    }

    protected void setVolume(int volume){
        this.volume = volume; 
    }

    public int getVolume(){
        if(volume == 0 ){
            volume = 1 ;
        }
        return volume;
    }

    public String getFicTecnica(){
        return "ISBN:"+getISBN()+"\nEditora:"+getEditora()+"\nPáginas:"+this.paginas+"\nAno de publicação:"+this.anoPublicacao+"\nDisponível:"+this.quantidade+" em estoque\nVolume:"+this.volume;
    }

   

    public void decrementarQuantidade(){
        quantidade --;
    }

    public boolean decrementarQuantidade(int nQuantidade){
        if ((quantidade - nQuantidade)  >= 0){
            quantidade -= nQuantidade;
            return true; 
        }
        return false;
    }

    public void incrementaQuantidade(int nQuantidade){
        quantidade += nQuantidade;
    }



}
