package Lista;
import java.util.ArrayList;
import java.util.List;

import Pessoa.Cliente;

public class Lista extends Generico{
    private List<Cliente> clientes = new ArrayList<>();


    public boolean compara(String cpf) {
        return super.compara(cpf, clientes);
    }

    public void BuscarCPF(String cpf) {
        super.BuscarCPF(cpf, clientes);
    }

    
    public void add(Cliente obj) {
        clientes.add(obj);
    }

    public void Buscar(String nome) {
        super.Buscar(nome, clientes);
    }


    

    public Cliente retornaCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCPF().contains(cpf))
                return cliente;
        }
        return null;
    }

    

}
