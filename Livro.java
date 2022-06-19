abstract public class Livro {
    private String nome;
    private String editora;
    private String ISBN;
    private String tipo; 
    private int quantidade;
    private Autor autor;

    private double preco;

    public Livro(String nome, String editora, int quantidade,double preco, Autor autor){
        this.nome = nome.toUpperCase();
        this.editora = editora.toUpperCase();
        this.quantidade = quantidade;
        this.preco = preco;
        this.autor = autor;
        this.tipo = autor.getGenero().toUpperCase();
        setISBN();

    }

    public String getNome(){
        return nome;
    }


    public String getISBN(){
        return ISBN;

    }

    public void setISBN() {
        int quantidade = getAutor().getPublicados();
        this.ISBN = getAutor().getCod() + Integer.toString(quantidade);

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

    public Autor getAutor() {
        return autor;
    }

    public String getFicTecnica(){
        return "Nome:"+getNome()+"\nISBN:"+getISBN()+"\nEditora:"+editora+"\nDisponível:"+this.quantidade+" em estoque";
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
