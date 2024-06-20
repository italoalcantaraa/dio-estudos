package Polimorfismo.Filmes;

public class Series extends Filme {
    private int temporadas;
    private int episodiosPorTemporada;
    private int temporadaAtual;
    private int episodioAtual;

    public Series(String nome, int temporadas, int episodiosPorTemporada) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }

    public void play(int temporadaAtual, int episodioAtual) {
        if (validaTemporada(temporadaAtual, episodioAtual)) {
            this.temporadaAtual = temporadaAtual;
            this.episodioAtual = episodioAtual;
            System.out.println(toString());
        } else {
            System.err.println("Valor inválido!");
        }
    }

    private boolean validaTemporada(int temporada, int episodio) {
        if (temporada > temporadas || episodio > episodiosPorTemporada) {
            return false;
        }

        if (temporada == 0 || episodio == 0) {
            return false;
        }

        return true;
    }

    public String toString() {
        String informacoes = String.format(
                "Serie: %s | Estado atual: %dx%02d \nTemporadas: %s\nEpisódios por temporada: %s (Áudio: %s | Legenda %s)",
                getNome(),
                temporadaAtual,
                episodioAtual,
                temporadas,
                episodiosPorTemporada,
                getAudio(),
                getLegenda());
        return informacoes;
    }

    // Métodos getters e setters
    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }

    public int getEpisodioAtual() {
        return temporadaAtual;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
}
