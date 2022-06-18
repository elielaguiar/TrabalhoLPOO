import java.util.ArrayList;
import java.util.List;

public class ListaAutor extends Lista {
    
    private List <Autor> autores= new ArrayList<Autor>();

    public void add(Autor obj){
        autores.add(obj);
    }

    public boolean compara(String cpf){
        boolean valor = false ;
        for (Autor autor : autores) {
            if( autor.getCPF().contains(cpf))
                valor = true;
        }
        return valor;
    }


}
