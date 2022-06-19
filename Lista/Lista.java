package Lista;
import java.util.ArrayList;
import java.util.List;

import Pessoa.Cliente;

public class Lista extends Generico{
    private List<Cliente> clientes = new ArrayList<>();

    public boolean compara(String cpf) {
        return super.compara(cpf, clientes);
    }

    
    public void add(Cliente obj) {
        clientes.add(obj);
    }

    public void Buscar(String nome) {
        super.Buscar(nome, clientes);
    }

    public void Imprime() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    public void BuscarCPF(String cpf) {
        boolean valor = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCPF().contains(cpf)) {
                System.out.println(cliente);
                valor = true;
            }
            if (!valor)
                System.out.println("Nenhum registro encontrado");
        }
    }

    public Cliente retornaCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCPF().contains(cpf))
                return cliente;
        }
        return null;
    }

}
