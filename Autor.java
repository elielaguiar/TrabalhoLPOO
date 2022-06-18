import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private int qtdPublicados;
    private String tipoGenero;
    private List<Livro> livrospublicados = new ArrayList<Livro>();

    public Autor(String nome, String CPF, String tipoGenero,String nasc){
        super(nome, CPF,nasc);
        this.tipoGenero = tipoGenero;
    }

    public Autor(Cliente cliente, String tipoGenero){
        super(cliente.getNome(),cliente.getCPF(),cliente.getDataNasc());
        this.tipoGenero = tipoGenero;
    }

    

    public int getPublicados(){
        return qtdPublicados;
    }

    public String getGenero(){
        return tipoGenero;
    }
        

}
