package Polimorfismo.Filmes;

public class Filme extends Video {
    private String audio;
    private String legenda;
    
    public Filme(String nomeString) {
        super(nomeString);
        this.audio = "Inglês";
        this.legenda = "sem legenda";
    }
    
    public void play(String audio) {
        this.audio = audio;
        System.out.println("Play: " + toString());
    }
    public void play(String audio, String legenda){
        this.audio = audio;
        this.legenda = legenda;
        if(audio == "Inglês"){
            this.legenda = "Português";
        }
        System.out.println("Play: " + toString());
    }

    public String toString() {
        String informacao = String.format("%s (audio: %s, legenda: %s)",getNome(), audio, legenda);
        return informacao;
    }

    //Getters e Setters Audio
    public void setAudio(String audio){
        this.audio = audio;
    }

    public String getAudio() {
        return audio;
    }
    //Getters e Setters Legenda
    public void setLegenda(String legenda){
        this.legenda = legenda;
    }

    public String getLegenda() {
        return audio;
    }
}
