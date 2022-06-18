import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List <Cliente> clientes= new ArrayList<Cliente>();
    
    public boolean compara(String cpf){
        boolean valor = false ;
        for (Cliente cliente : clientes) {
            if( cliente.getCPF().contains(cpf))
                valor = true;
        }
        return valor;
    }

   

    public void add(Cliente obj){
        clientes.add(obj);
    }

   

   public void Imprime(){
    for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
    }
   }

   

    public void Buscar(String nome){
        for (Cliente cliente : clientes) {
            if(cliente.getNome().contains(nome.toUpperCase())){
                System.out.println(cliente);
                }
            }
        }
    
    public Cliente retornaCliente(String cpf){
        for (Cliente cliente : clientes) {
            if(cliente.getCPF().contains(cpf))
                return cliente;
            
        }
        return null;
    }



   
    
}
