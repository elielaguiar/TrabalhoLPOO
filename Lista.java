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
        boolean valor = false;
        for (Cliente cliente : clientes) {
            if(cliente.getNome().toUpperCase().contains(nome.toUpperCase())){
                System.out.println(cliente);
                valor = true;
                }
            }
            if (!valor)
                System.out.println("Nenhum registro,encontrado");
        }

        public void BuscarCPF(String cpf){
            boolean valor = false;
            for (Cliente cliente : clientes) {
                if(cliente.getCPF().contains(cpf)){
                    System.out.println(cliente);
                    valor = true;
                }
            if(!valor)
                System.out.println("Nenhum registro encontrado");
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
