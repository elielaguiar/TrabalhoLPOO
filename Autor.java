public class Autor extends Pessoa {
    private int qtdPublicados;
    private String tipoGenero;

    public Autor(String nome, int CPF, String tipoGenero){
        super(nome, CPF);
        this.tipoGenero = tipoGenero;
    }

    public int getPublicados(){
        return qtdPublicados;
    }

    public String getGenero(){
        return tipoGenero;
    }
        

}
