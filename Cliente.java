import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private String   autorFavorito;
    private List <Livro> livros = new ArrayList <Livro>(); // livros comprados
    private int telefone;

    //public boolean emiteNota();
    //public boolean compra(); 


    public Cliente(String nome, String CPF, String dataNasc){
        super(nome, CPF,dataNasc);      
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setAutorFavorito(String autorFavorito) {
        this.autorFavorito = autorFavorito;
    }

    
}


