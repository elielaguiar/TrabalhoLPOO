

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Leitura ler = new Leitura();
        Scanner string = new Scanner(System.in);
        ListaAutor clientes = new ListaAutor();
        int i = 0;
        String nome ,cpf,nasc,genero,dataNasc;

        
        
        do{
            System.out.println();

            i = ler.lerInteiro("1 - Cadastrar cliente:\n2 - Procurar cadastro:\n3-Procurar Livro:\n4-Reservar Livro:\n4-Buscar autor:\n5-Comprar Livro:\n6-Cadastrar Livro:\n7- Cadastrar autor\nOpção:");

            if(i == 1){
                
                nome = ler.lerString("Nome:");
                cpf = ler.validaCpf("CPF:");
                nasc = ler.lerString("Data de nascimento:");
                Cliente cliente = new Cliente(nome, cpf, nasc);
                //fazer a compração se cliente já existe
                System.out.println(clientes.add(cliente));
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
                Autor autor = new Autor("dav", "05843585123", "literatuda", "06/03/2003");
                clientes.add(autor);
            }
        }
        while(i != 0);
    }
}