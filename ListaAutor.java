import java.util.ArrayList;
import java.util.List;

public class ListaAutor extends Lista {
    
    private List <Autor> autores= new ArrayList<Autor>();

    public void add(Autor obj){
        autores.add(obj);
    }

    public boolean comparaAutor(String cpf){
        boolean valor = false ;
        for (Autor autor : autores) {
            if( autor.getCPF().contains(cpf))
                valor = true;
        }
        return valor;
    }

    public void BuscarAutor(String nome){
        boolean valor = false;
        for (Autor autores : autores) {
            if(autores.getNome().toUpperCase().contains(nome.toUpperCase())){
                System.out.println(autores);
                valor = true;
                }
            }
            if (!valor)
                System.out.println("Nenhum registro,encontrado");
        }

    public void ImprimeAutor(){
        for (Autor autor : autores) {
                System.out.println(autor.toString());
        }
       }


}
