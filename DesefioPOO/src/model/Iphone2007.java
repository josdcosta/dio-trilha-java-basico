package model;

public class Iphone2007 implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{
    private String musica;
    private String numero;
    private String url;
    @Override
    public void ligar(String numero) {
        this.numero = numero;
        System.out.printf("Ligando para %s\n", numero);
    }

    @Override
    public void rediscar() {
        System.out.printf("Ligando novamente para %s\n", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendendo telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        this.url = url;
        System.out.printf("Abrindo pagina %s\n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador...");
        if(url == null || url.isEmpty()){
            System.out.print("Aba vazia carregada\n");
        } else {
            exibirPagina(url);
        }
    }

    @Override
    public void atualizarPagina() {
        if(url == null || url.isEmpty()){
            System.out.println("Não há pagina aberta");
        } else {
            System.out.printf("Atualizando página %s\n", url);
        }
    }

    @Override
    public void tocar() {
        if(musica == null || musica.isEmpty()){
            System.out.println("Selecione a musica primeiro.");
        } else {
            System.out.println("Tocando musica");
        }
    }

    @Override
    public void pausar() {
        if(musica.isEmpty()){
            System.out.println("Não há musica para pausar");
        } else {
            System.out.printf("Musica pausada %s\n", musica);
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Musica %s selecionada\n", musica);
        this.musica = musica;
    }
}
