abstract public class Livro {
    private String nome;
    //private Autor autor; implementar a classe
    // criar lista de espera 
    private String editora;
    private int ISBN;
    private String tipo; // não vai ser no construtor
    private int quantidade;
    private Autor autor;
    private int volume;
    private double preco;

    public Livro(String nome, String editora, int quantidade,double preco, Autor autor){
        this.nome = nome;
        this.editora = editora;
        this.quantidade = quantidade;
        this.preco = preco;
        this.autor = autor;
        this.tipo = autor.getGenero();

    }

    

    public String getNome(){
        return nome;
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

    public int getVolume(){
        if(volume == 0 ){
            volume = 1 ;
        }
        return volume;
    }

    public String getFicTecnica(){
        return "ISBN:"+getISBN()+"\nEditora:"+getEditora()+"\nDisponível:"+this.quantidade+" em estoque\nVolume:"+this.volume;
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

    public int getQuantidade() {
        return quantidade;
    }

    public boolean equals (Livro livro ) {
        if(this.getNome() != livro.getNome())
            return false;
        if(this.getTipo() != livro.getTipo())
            return false;
        return true;
    }


}
