

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Leitura ler = new Leitura();
        Scanner string = new Scanner(System.in);
        Lista clientes = new Lista();
        int i = 0,idade,cpf;
        String nome ;

        
        
        do{
            System.out.println();

            i = ler.lerInteiro("1 - Cadastrar cliente:\n2 - Procurar cadastro:\n3-Procurar Livro:\n4-Reservar Livro:\n4-Buscar autor:\n5-Comprar Livro:\n6-Cadastrar Livro:\nOpção:");

            if(i == 1){
                System.out.println("Nome:");
                nome = string.nextLine();
                cpf = ler.lerInteiro("CPF");
                idade = ler.lerInteiro("Idade");
                Cliente cliente = new Cliente(nome, cpf, idade);
                //fazer a compração se cliente já existe
                System.out.println( clientes.add(cliente));
            };
            if(i == 2){
                System.out.print("Nome a ser buscado");
                nome = string.nextLine();
                if(nome.length() == 0){
                    cpf = ler.lerInteiro("CPF:");
                    clientes.Buscar(cpf);
                }
                    
                else{
                    clientes.Buscar(nome);
                }
            }
            if(i == 3){

            }

            if (i == 4 ){

            }

            if( i == 5){

            }
        }
        while(i != 0);
    }
}