import java.util.InputMismatchException;
import java.util.Scanner;

import Livro.Livro;


public class Leitura{
    public int lerInteiro(String msn ){
        boolean ok = false;
        int i =0 ;
        do{
            System.out.print(msn);
            Scanner ler = new Scanner(System.in);
            try{
                i = ler.nextInt();
                if(i <= 0){
                    throw new Excecoes();
                }
                ok = true;
            }catch (java.util.InputMismatchException e){
                System.out.println("Aceitamos apenas números inteiros ");
            }
            catch(Excecoes e){
                System.out.println(e.ValoresNegativos());
            }
           }while(ok == false);
           return i;
    }


    public int whileOpcao(String msn, int min , int max ){ //define quais são os limites das opções para que não precisa criar várias na main
        boolean condicao = false;
        int cont = 0;
        while(!condicao){
            try{
                cont = lerInteiro(msn);
                if (cont > max){
                    throw new Excecoes();
                }
                else if(cont < min){
                    throw new Excecoes();
                }
            condicao = true;
            }catch(Excecoes e){
                System.out.println(e.ForaDaOpcao());
            }
            
        }
        return cont ;

    }

    public String validaCpf(String msn){
        
        String cpf = "";
        boolean condicao = false;
        
        Scanner ler = new Scanner(System.in);
        while(!condicao){
            System.out.print(msn);
            cpf = ler.nextLine();
            cpf = cpf.replace(" ", "").replace(".", "").replace("-", "");
            if(cpf.length()==11){
                try{
                    Double.parseDouble(cpf);
                    condicao = true;
                }
                catch(NumberFormatException e){
                    System.out.println("Parâmetro invalido,apenas números");
                }
            }
            else{
                System.out.println("Número do tamanho de padrão");
            }
        }
        return cpf;
        
        }

        public String lerString(String msn){
            System.out.print(msn);
            Scanner ler = new Scanner(System.in);
            return ler.nextLine();

        }

        public double lerDouble(String msn){
            System.out.print(msn);
            boolean valor = false;
            Scanner ler = new Scanner(System.in);
            double x =0 ;
            do{
                
                try{
                    x = ler.nextDouble();
                    valor = true;
                }catch(InputMismatchException obj){
                    System.out.println("Separador de decimal é a virgula");
                    
                }
                
            }while(valor==false);
        return x;
        }

        public int lerQuantidade(String msn ,Livro livro){
            boolean valor = false;
            int i = 0 ;
            do{
                i = lerInteiro(msn);
                if(livro.getQuantidade() >= i && i > 0){
                    valor = true;
                }
                else{
                    System.out.println("Quantidade indisponível");
                }
            }while(!valor);
            return i;
        }
        
}
