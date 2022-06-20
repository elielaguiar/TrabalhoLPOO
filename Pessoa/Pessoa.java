package Pessoa;

abstract public class Pessoa{
    private String nome;
    private String CPF;
    private String dataNasc;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, String CPF,String nas){
        this.nome = nome.toUpperCase();
        this.CPF = CPF;
        this.dataNasc = nas;
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

    public String getDataNasc() {
        return dataNasc;
    }

    

    public boolean equals(Pessoa pessoa) { // compara entre os objetos
        if(this.getCPF() == pessoa.getCPF()){
            return true;
        }
        return false;
    }

    public String toString() {
        String string = "Nome:" +getNome()+"\nCPF:"+getCPF()+"\nData de nascimento:"+getDataNasc()+".\n";
        return string;
    }



}