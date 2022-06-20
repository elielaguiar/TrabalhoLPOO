import Auxiadores.Leitura;
import Lista.*;
import Livro.*;
import Pessoa.*;

public class Main {
    public static void main(String[] args) {

        Leitura ler = new Leitura();
        Lista clientes = new Lista();
        ListaAutor autores = new ListaAutor();
        ListaLivro livros = new ListaLivro();
        Cliente cliente;
        Autor autor;
        int i = 0, quantidade,cod;
        double preco;

        String nome, cpf, nasc, genero, nomeLivro, editora, tipoFicao, descricao, telefone;

        do {
            System.out.println();

            i = ler.lerInteiro(
                    "1 - Cadastrar cliente:\n2 - Procurar cadastro:\n3 - Procurar Livro:\n4 - Buscar autor:\n5 - Comprar Livro:\n6 - Cadastrar Livro:\n7 - Cadastrar autor:\n8 - Atualizar Dados Livro:\nOpção:");

            if (i == 1) {

                cpf = ler.validaCpf("CPF:");
                if (clientes.compara(cpf))
                    System.out.println("Cliente já cadastrado.\n");
                else {
                    nome = ler.lerString("Nome:");
                    nasc = ler.lerString("Data de nascimento: ");
                    telefone = ler.lerString("Telefone: ");
                    cliente = new Cliente(nome, cpf, nasc, telefone);
                    clientes.add(cliente);
                    System.out.println("Usuário Cadastrado com sucesso!\n");
                }
            }
            if (i == 2) {
                nome = ler.lerString("Nome: ");
                if (nome == "") {
                    cpf = ler.validaCpf("CPF: ");
                    clientes.BuscarCPF(cpf);

                } else {
                    clientes.Buscar(nome);
                }
            }
            if (i == 3) {
                nome = ler.lerString("Nome do livro:");
                if (nome == "") {
                    nome = ler.lerString("Nome do Autor:");
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
                cpf = ler.validaCpf("CPF");
                cliente = clientes.retornaCliente(cpf);
                quantidade = ler.lerInteiro("Quantidade desejada");
                System.out.println(livros.compra(nome, cpf, quantidade, cliente));
            }
            if (i == 6) {
                cod = ler.lerInteiro("Código do autor:");
                autor = autores.BuscarCod(cod);
                if (autor == null) {
                    System.out.println("Autor não encontrado.\n");
                } else {
                    nomeLivro = ler.lerString("Nome do livro:");
                    editora = ler.lerString("Editora:");
                    quantidade = ler.lerInteiro("Quantidade:");

                    preco = ler.lerDouble("Preço:");
                    boolean valor;
                    String codigo;
                    System.out.println("1 - Ficção\n2 - Cíentifico");
                    i = ler.whileOpcao("Opção:", 1, 2);
                    if (i == 1) {
                        tipoFicao = ler.lerString("Tipo de ficção: ");
                        descricao = ler.lerString("Descrição: ");
                        Ficcao livro = new Ficcao(nomeLivro, editora, quantidade, preco, autor, tipoFicao, descricao);
                        codigo = livro.getISBN();
                        valor = livros.add(livro);
                    } else {
                        String esp, orgao, area;
                        esp = ler.lerString("Especialidade: ");
                        orgao = ler.lerString("Órgão autorizado: ");
                        area = ler.lerString("Área:");
                        Cientifico livro = new Cientifico(nomeLivro, editora, quantidade, preco, autor, esp, area,
                                orgao);
                        codigo = livro.getISBN();
                        valor = livros.add(livro);
                    }
                    if (valor) {
                        System.out.println("Não cadastrado , livro já existente no acervo\n");
                    } else {
                        System.out.println("Livro cadastrado com sucesso.Com o ISBN:"+codigo+"\n");
                    }

                }

            }
            if (i == 7) {
                cpf = ler.validaCpf("CPF:");
                if (autores.compara(cpf)) {
                    System.out.println("Autor já cadastrado.\n");
                } else {
                    Cliente aux = clientes.retornaCliente(cpf);
                    if (aux == null) {
                        nome = ler.lerString("Nome:");
                        nasc = ler.lerString("Data de nascimento:");
                        telefone = ler.lerString("Telefone:");
                        aux = new Cliente(nome, cpf, nasc, telefone);
                        clientes.add(aux);
                    }
                    genero = ler.lerString("Gênero:");
                    autor = new Autor(aux, genero);
                    cod = autores.add(autor);
                    System.out.println("Autor cadastrado com sucesso.Código do autor :"+cod+"\n");
                }
            }

            if (i == 8) {
                nome = ler.lerString("ISBN do livro:");
                Livro livro = livros.BuscarISBN(nome);
                if (livro == null) {
                    System.out.println("Livro não encontrado.\n");
                } else {
                    i = ler.whileOpcao("1 - Atualizar quantidade\n2 - Mudar preço\nOpção:", 1, 2);
                    if (i == 2) {
                        preco = ler.lerDouble("Novo Preço:");
                        livro.setPreco(preco);
                        System.out.println("Novo preço alterado com sucesso");
                    } else {
                        quantidade = ler.lerInteiro("Acrescentar quantos livros:");
                        livro.incrementaQuantidade(quantidade);
                        System.out.println("Adicionada com sucesso.\n");
                    }
                }

            }

        } while (i != 0);
    }
}