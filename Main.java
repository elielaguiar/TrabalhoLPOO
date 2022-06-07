import java.util.Scanner;

class Main{

    
    public static void main(String[] args){

        leitura ler = new leitura();  
        int opcao = ler.whileOpcao("Opção:",5, 10);
        System.out.println(opcao);
        

    }
}