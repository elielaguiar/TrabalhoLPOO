package Lista;

import java.util.ArrayList;
import java.util.List;

import Auxiadores.Leitura;
import Auxiadores.Leitura.*;
import Pessoa.Autor;
import Pessoa.Pessoa;

public class Generico {
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
        for (Pessoa autor : lista1) {
            if (autor.getNome().toUpperCase().contains(nome.toUpperCase())) {
                System.out.println(autor.toString());
                valor = true;
            }
        }
        if (!valor)
            System.out.println("Nenhum registro,encontrado");
    }
}
