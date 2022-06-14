
abstract public class Pessoa{
    private String nome;
    private String CPF;
    private String dataNasc;

    //abstract public String podeComprar();
    //abstract public boolean emiteNota();

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, String CPF){
        this.nome = nome.toUpperCase();
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

    public boolean equals(Pessoa pessoa) { // compara entre os objetos
        if(this.getCPF() == pessoa.getCPF()){
            return true;
        }
        return false;
    }

    public String toString() {
        String string = "Nome:" +getNome()+"\nCPF:"+getCPF();
        return string;
    }



}