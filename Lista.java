import java.util.ArrayList;
import java.util.List;

public class Lista {
    List <Cliente> clientes= new ArrayList<Cliente>();
    
    public boolean compara(Cliente obj){
        boolean valor = false ;
        for (Cliente cliente : clientes) {
           valor = cliente.equals(obj);
        }
        return valor;
    }

    public String add(Cliente obj){
        if(!compara(obj)){
            clientes.add(obj);
            return "Cadastrado o Cliente";
        }
        return "Cadastro já existente com o mesmo cpf";
    }

   public void Imprime(){
    for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
    }
   }

   public void Buscar(int cpf){
    for (Cliente cliente : clientes) {
        if(cliente.getCPF() == cpf){
            System.out.println(cliente);
            }
        }
    }

    public void Buscar(String nome){
        for (Cliente cliente : clientes) {
            if(cliente.getNome().contains(nome.toUpperCase())){
                System.out.println(cliente);
                }
            }
        }

    
}
