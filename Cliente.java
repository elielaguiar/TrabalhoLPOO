public class Cliente extends Pessoa {

    private String endereco, email, autorFavorito, livrosComprados[];
    private int telefone, qtdComprados;

    public Cliente(String nome, String CPF, String autorFavorito){
        super(nome, CPF);
        this.autorFavorito = autorFavorito;
    }

    public Cliente(String nome, String CPF){
        super(nome, CPF);      
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


