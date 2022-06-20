package Auxiadores;
public class Excecoes extends RuntimeException {
    public String ValoresNegativos(){
        return "Não são permitidos valores negativos e nulos.\n";
    }

    public String ForaDaOpcao(){
        return "Valor está fora das opções desejadas.\n";
    }
}
