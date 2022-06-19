
import java.util.Scanner;

import Lista.*;
import Livro.*;
import Pessoa.*;
import Pessoa.*;

public class Main {

    public static void main(String[] args) {

        Leitura ler = new Leitura();
        Lista clientes = new Lista();
        ListaAutor autores = new ListaAutor();
        ListaLivro livros = new ListaLivro();
        Cliente cliente;
        Autor autor;
        int i = 0,quantidade;
        double preco;
        Scanner scanner = new Scanner(System.in);
        String nome, cpf, nasc, genero, dataNasc,cod,nomeLivro,editora,tipoFicao,descricao;

        do {
            System.out.println();

            i = ler.lerInteiro(
                    "1 - Cadastrar cliente:\n2 - Procurar cadastro:\n3-Procurar Livro:\n4-Buscar autor:\n5-Comprar Livro:\n6-Cadastrar Livro:\n7- Cadastrar autor\nOpção:");

            if (i == 1) {

                cpf = ler.validaCpf("CPF:");
                if (clientes.compara(cpf))
                    System.out.println("Cliente já cadastrado");
                else {
                    nome = ler.lerString("Nome:");
                    nasc = ler.lerString("Data de nascimento:");
                    cliente = new Cliente(nome, cpf, nasc);
                    clientes.add(cliente);
                }

            }
            ;
            if (i == 2) {
                nome = ler.lerString("Nome:");
                if (nome == "") {
                    cpf = ler.validaCpf("CPF:");
                    clientes.BuscarCPF(cpf);

                } else {
                    clientes.Buscar(nome);
                }
            }
            if (i == 3) {
                nome = ler.lerString("Nome do livro:");
                if (nome == "") {
                    nome  = ler.lerString("Nome do Autor:");
                    livros.BuscarAutor(nome);
                } else {
                    livros.BuscarNome(nome);
                }

            }

            if (i == 4) {
                nome = ler.lerString("Nome:");
                if (nome == "") {
                    cpf = ler.validaCpf("CPF:");
                    autores.BuscarCPF(cpf);
                } else {
                    autores.Buscar(nome);
                }

            }

            if (i == 5) {
                nome = ler.lerString("ISBN do livro");
                Livro livro = livros.BuscarISBN(nome);
                if(livro!= null){
                    cpf = ler.validaCpf("CPF");
                    cliente = clientes.retornaCliente(cpf);
                    if(cliente != null){
                        quantidade = ler.lerQuantidade("Quantidade", livro);
                        livro.decrementarQuantidade(quantidade);
                        System.out.println("Compra realizada com sucesso");
                    }
                    else{
                        System.out.println("Cliente não encontrado");
                    }
                }else{
                    System.out.println("Livro não encontrado");
                }
            }
            if (i == 6) {
                cod = ler.lerString("Código do autor:");
                autor = autores.BuscarCod(cod);
                if(autor == null){
                    System.out.println("Autor não encontrado");
                }
                else{
                    nomeLivro = ler.lerString("Nome do livro");
                    editora = ler.lerString("Editora");
                    quantidade = ler.lerInteiro("Quantidade");
                    
                    preco = ler.lerDouble("Preço:");
                    boolean valor;
                    System.out.println("1 - Ficção\n2 - Cíentifico");
                    i = ler.whileOpcao("Opção", 1, 2);
                    if(i == 1){
                        tipoFicao = ler.lerString("Tipo de ficção");
                        descricao = ler.lerString("Descrição");
                        Ficcao livro = new Ficcao(nomeLivro, editora, quantidade, preco, autor, tipoFicao, descricao);
                        valor = livros.add(livro);
                    }
                    else{
                        String esp , orgao, area;
                        esp = ler.lerString("Especialidade:");
                        orgao = ler.lerString("Orgão autorizado:");
                        area = ler.lerString("Area:");
                        Cientifico livro = new Cientifico(nomeLivro, editora, quantidade, preco, autor, esp, area, orgao);
                        valor = livros.add(livro);
                    }
                    if(valor){
                        System.out.println("Não cadastrado , livro já existente no acervo");
                    }
                    else{
                        System.out.println("Livro cadastrado com sucesso");
                    }
    
                    

                
                }

            }
            if (i == 7) {
                cpf = ler.validaCpf("CPF:");
                if (autores.compara(cpf)) {
                    System.out.println("Autor já cadastrado");
                } else {
                    Cliente aux = clientes.retornaCliente(cpf);
                    if (aux == null) {
                        nome = ler.lerString("Nome:");
                        nasc = ler.lerString("Data de nascimento");
                        aux = new Cliente(nome, cpf, nasc);
                        clientes.add(aux);
                    }
                    genero = ler.lerString("Genero Literário");
                    autor = new Autor(aux, genero);
                    autores.add(autor);
                }
            }
        } while (i != 0);
    }
}