public class Cliente extends Pessoa {
    private int idade;
    private int telefone;
    private String email;
    private String autorFavorito;
    private String livrosComprados[];
    private int qtdComprados;

    public Cliente(String nome, int CPF, int idade){
        super(nome, CPF);
        this.idade = idade;

    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public String toString() {
        String string = super.toString();
        return string+ " "+getTelefone()+" " +getEmail();
    }

    
    
}
