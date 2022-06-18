

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Leitura ler = new Leitura();
        Scanner string = new Scanner(System.in);
        ListaAutor clientes = new ListaAutor();
        Cliente cliente ;
        int i = 0;
        String nome ,cpf,nasc,genero,dataNasc;

        
        
        do{
            System.out.println();

            i = ler.lerInteiro("1 - Cadastrar cliente:\n2 - Procurar cadastro:\n3-Procurar Livro:\n4-Reservar Livro:\n4-Buscar autor:\n5-Comprar Livro:\n6-Cadastrar Livro:\n7- Cadastrar autor\nOpção:");

            if(i == 1){
                
                cpf = ler.validaCpf("CPF:");
                if(clientes.compara(cpf))
                    System.out.println("Cliente já cadastrado");
                else{
                    System.out.print(clientes.compara(cpf));
                    nome = ler.lerString("Nome:");
                    nasc = ler.lerString("Data de nascimento:");
                    cliente = new Cliente(nome, cpf, nasc);
                    clientes.add(cliente);
                }
                
            };
            if(i == 2){
                
                
            }
            if(i == 3){

            }

            if (i == 4 ){

            }

            if( i == 5){

            }
            if( i == 6){

            }
            if( i == 7){
                cpf = ler.validaCpf("CPF:");
                if(clientes.compara(cpf)){
                    System.out.println("Autor já cadastrado");
                }
                else{
                    Cliente aux = clientes.retornaCliente(cpf);
                    if(aux== null){
                        nome = ler.lerString("Nome:");
                        nasc = ler.lerString("Data de nascimento");
                        aux = new Cliente(nome, cpf, nasc);
                        clientes.add(aux); 
                    }
                    genero = ler.lerString("Genero Literário");
                    Autor autor = new Autor(aux,genero);
                    clientes.add(autor);
                }
            }
        }
        while(i != 0);
    }
}