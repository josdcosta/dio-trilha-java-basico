import model.Iphone2007;

public class Main {
    public static void main(String[] args) {
        Iphone2007 iphone = new Iphone2007();
        iphone.ligar("1599009911");
        iphone.rediscar();
        iphone.tocar();
        iphone.selecionarMusica("Bohemian Rhapsody - Queen");
        iphone.tocar();
        iphone.pausar();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.linkedin.com/in/josuecosta1992/");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        iphone.iniciarCorreioVoz();
    }
}