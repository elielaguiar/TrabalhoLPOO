package Lista;

import java.util.ArrayList;
import java.util.List;

import Livro.Livro;
import Pessoa.*;


public class ListaLivro implements Cloneable {
    List<Livro> livros = new ArrayList<>();
    List<Livro> livrosVazios = new ArrayList<>();

    public boolean add(Livro obj) {
        boolean valor = compara(obj);
        if (!valor) {
            livros.add(obj);
            listaAutor(obj.getAutor(), obj);
        }

        return valor;
    }

    public boolean compara(Livro qualquer) {
        boolean valor = false;
        for (Livro livro : livros) {
            if (livro.equals(qualquer))
                valor = true;
        }
        for (Livro livro : livrosVazios) {
            if (livro.equals(qualquer))
                valor = true;
        }
        return valor;
    }

    private void listaAutor(Autor qualquer, Livro livro) {
        qualquer.addLivro(livro);
    }

    private void livrosVazios(Livro qualquer) {
        if (qualquer.getQuantidade() == 0) {
            livrosVazios.add(qualquer);
            livros.remove(qualquer);
        }
    }

    private void livrosCompletos(Livro qualquer){
        if(qualquer.getQuantidade() > 0){
            livros.add(qualquer);
            livrosVazios.remove(qualquer);
        }
    }

    public void BuscarNome(String nome) {
        boolean valor = false;
        for (Livro livro : livros) {
            if (livro.getNome().contains(nome.toUpperCase())) {
                valor = true;
                System.out.println(livro.getFicTecnica());
            }
        }
        if (!valor) {
            System.out.println("Nenhum cadastro encontrado.\n");
        }

    }

    public void BuscarAutor(String nomeAutor) {
        boolean valor = false;
        for (Livro livro : livros) {
            if (livro.getAutor().getNome().contains(nomeAutor.toUpperCase())) {
                System.out.println(livro.getFicTecnica());
            }
        }
        if (!valor) {
            System.out.println("Nenhum cadastro encontrado.\n");
        }
    }

    public Livro BuscarISBN(String IBSN) {
        Livro valor = null;
        for (Livro livro : livros) {
            if (livro.getISBN().contains(IBSN.toUpperCase())) {
                valor = livro;
            }
        }
        return valor;
    }

    private Livro BuscarISBNeNulos(String IBSN) {
        Livro valor = null;
        for (Livro livro : livros) {
            if (livro.getISBN().contains(IBSN.toUpperCase())) {
                valor = livro;
            }
        }
        for (Livro livro : livrosVazios) {
            if (livro.getISBN().contains(IBSN.toUpperCase())) {
                valor = livro;
            }
        }
        return valor;
    }

    public String compra(String ISBN, String cpf, int quantidade,Cliente cliente) {
        Livro livro = BuscarISBNeNulos(ISBN);
        if (livro == null) 
            return "Livro não encontrado";
        if (cliente == null) 
            return "Cliente não encontrado";
        if(!livro.decrementarQuantidade(quantidade))
            return "Compra cancelada ,quantidade maior do que no estoque";
        cliente.add(livro );
        livrosVazios(livro);
        return "Compra realizada com sucesso";
    }

    public void incrementaQuantidade(Livro livro, int newQuant){
        livro.incrementaQuantidade(newQuant);
        livrosCompletos(livro);

    }

}
