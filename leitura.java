import java.util.Scanner;
public class leitura{
    public int lerInteiro(String msn ){
        boolean ok = false;
        int i =0 ;
        do{
            System.out.print(msn);
            Scanner ler = new Scanner(System.in);
            try{
                i = ler.nextInt();
                if(i < 0){
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
}
