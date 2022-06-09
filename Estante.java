import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
public class Estante {
    

    private String categoria;
    private int quantMaximo;
    private String unico;

    private Set <Livro> estante = new TreeSet<Livro>();
    
    public Estante(String categoria, int quantMaximo){
        this.categoria= categoria;
        this.quantMaximo = quantMaximo;
    }  

    public Estante(Livro livro){
        this.categoria = livro.getTipo();
        this.quantMaximo = 100;
    }

    public void addLivro(Livro livro){
        for (Livro livros : estante) {
            if(livro.equals(livro))
            {
                try{
                    if(livros.getQuantidade() + livro.getQuantidade() > quantMaximo){
                        throw new Excecoes();
                    }else{
                        livros.incrementaQuantidade(livro.getQuantidade());
                    }
                }catch (Excecoes e){
                    System.out.println(e.Espaco());
                }
        }
        else{
            estante.add(livro);
        }
            }
               
    }
}
