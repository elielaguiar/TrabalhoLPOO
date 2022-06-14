abstract public class Pessoa{
    private String nome;
    private int CPF;

    //abstract public String podeComprar();
    //abstract public boolean emiteNota();

    public Pessoa(String nome, int CPF){
        this.nome = nome.toUpperCase();
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