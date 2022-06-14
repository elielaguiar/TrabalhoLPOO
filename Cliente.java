public class Cliente extends Pessoa {
    private String endereco, email, autorFavorito, livrosComprados[];
    private int idade, telefone, qtdComprados;

    public Cliente(String nome, String CPF, int idade, String autorFavorito){
        super(nome, CPF);
        this.idade = idade;
        this.autorFavorito = autorFavorito;

    }

    
    
    
}
