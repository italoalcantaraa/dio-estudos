package exercicios.exer2.dominio;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegarInternet {
    private String musica;
    private String numero;
    private String url;

    public void tocar() {
        System.out.println("Tocando música...");
    };

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionda: " + musica);
        this.musica = musica;
    }

    public void ligar(String numero) {
        System.out.println("Número para ligar: " + numero);
        this.numero = numero;
    };

    public void atender() {
        System.out.println("Atende");
    };

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    };

    public void exibirPagina(String url) {
        System.out.println("Página para exibir");
        this.url = url;
    };

    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba.");
    };

    public void atualizarPagina() {
        System.out.println("Atualizando");
    };

    public String getMusica() {
        return musica;
    }

    public String getNumero() {
        return numero;
    }

    public String getUrl() {
        return url;
    }
}
