abstract public class Pessoa{
    private String nome;
    private String CPF;

    //abstract public String podeComprar();
    //abstract public boolean emiteNota();

    public Pessoa(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getCPF(){
        return CPF;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }



}