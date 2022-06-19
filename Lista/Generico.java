package Lista;

import java.util.ArrayList;
import java.util.List;

import Pessoa.Autor;
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


    public void Buscar(String nome,List lista) {
        boolean valor = false;
        List<Pessoa> lista1 = lista; 
        for (Pessoa autor : lista1) {
            if (autor.getNome().toUpperCase().contains(nome.toUpperCase())) {
                System.out.println(autor);
                valor = true;
            }
        }
        if (!valor)
            System.out.println("Nenhum registro,encontrado");
    }

    public Pessoa BuscarCPF(String cpf, List lista) {
        boolean valor = false;
        List<Pessoa> lista1 = lista;
        Pessoa a  = null; 
        for (Pessoa autor : lista1) {
            if (autor.getCPF().contains(cpf)) {
                a = autor;
                valor = true;
                System.out.println(autor);
            }
        }
        if(!valor)
            System.out.println("Nenhum registro encontrado");
        return a;
            
    }
       
}

    

