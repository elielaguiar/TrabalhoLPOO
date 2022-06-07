public class Excecoes extends RuntimeException {
    public String ValoresNegativos(){
        return "Não são permitidos valores negativos";
    }

    public String ForaDaOpcao(){
        return "Valor está fora das opções desejadas";
    }
}
