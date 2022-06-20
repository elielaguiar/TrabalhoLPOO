package Lista;

import java.util.List;

import Pessoa.Pessoa;

abstract public class Generico {
    public boolean compara(String cpf, List lista) {
        boolean valor = false;
        List<Pessoa> lista1 = lista;
        for (Pessoa cliente : lista1) {
            if (cliente.getCPF().contains(cpf))
                valor = true;
        }
        return valor;
    }

    public void Buscar(String nome, List lista) {
        boolean valor = false;
        List<Pessoa> lista1 = lista;
        for (Pessoa pessoa : lista1) {
            if (pessoa.getNome().contains(nome.toUpperCase())) {
                System.out.println(pessoa);
                valor = true;
            }
        }
        if (!valor)
            System.out.println("Nenhum registro encontrado.\n");
    }

    public void BuscarCPF(String cpf,List lista) {
        boolean valor = false;
        List<Pessoa> lista1 = lista;
        for (Pessoa pessoa : lista1) {
            if (pessoa.getCPF().contains(cpf)) {
                System.out.println(pessoa);
                valor = true;
            }
            if (!valor)
                System.out.println("Nenhum registro encontrado.\n");
        }
    }

    
}
