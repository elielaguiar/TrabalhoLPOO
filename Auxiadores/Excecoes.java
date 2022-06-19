package Auxiadores;
public class Excecoes extends RuntimeException {
    public String ValoresNegativos(){
        return "Não são permitidos valores negativos e nulos";
    }

    public String ForaDaOpcao(){
        return "Valor está fora das opções desejadas";
    }

    public String Espaco(){
        return "Não há mais espaço";
    }
}
