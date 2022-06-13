abstract public class Pessoa{
    private String nome;
    private int CPF;

    //abstract public String podeComprar();
    //abstract public boolean emiteNota();

    public Pessoa(String nome, int CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public void setCPF(int CPF){
        this.CPF = CPF;
    }

    public int getCPF(){
        return CPF;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }



}