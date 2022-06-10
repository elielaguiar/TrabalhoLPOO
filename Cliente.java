public class Cliente extends Pessoa {
    private String endereco;
    private int idade;
    private int telefone;
    private String email;
    private String autorFavorito;
    private String livrosComprados[];
    private int qtdComprados;

    public Cliente(String nome, int CPF, int idade, String autorFavorito){
        super(nome, CPF);
        this.idade = idade;
        this.autorFavorito = autorFavorito;

    }

    
    
}
