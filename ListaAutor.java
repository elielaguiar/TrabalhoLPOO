import java.util.ArrayList;
import java.util.List;

public class ListaAutor extends Lista {
    
    private List <Autor> autores= new ArrayList<Autor>();
    


    public boolean compara(Autor obj){
        boolean valor = false;
        for (Autor autor : autores) {
            if(autor.equals(obj))
                valor = true;
        }
        return valor ;
    }

    public String add(Autor obj){
        if(!compara(obj)){
            autores.add(obj);
            return "Cadastrado o Cliente";
        }
        return "Cadastro já existente com o mesmo cpf";
    }

}
