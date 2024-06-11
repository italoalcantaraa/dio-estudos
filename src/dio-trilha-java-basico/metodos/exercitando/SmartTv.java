package metodos.exercitando;

public class SmartTv {
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 0;

    public void ligartTv() {
        this.ligada = true;
    }

    public void desligartTv() {
        this.ligada = false;
    }

    public void mudarCanal(int canalSelecionado) {
        this.canal = canalSelecionado;
    }

    public void diminuirCanal() {
        this.canal--;
    }

    public void aumentarCanal() {
        this.canal++;
    }

    public void aumetarVolume() {
        this.volume++;
        System.out.println("Volume atual: " + volume);
    }

    public void diminuirVolume() {
        this.volume--;
        System.out.println("Volume atual: " + volume);
    }

    public void imprimirCanal() {
        System.out.println("Canal atual: " + canal);
    }

    public void imprimirEstadoTv() {
        System.out.println("TV ligada: " + ligada);
    }

    public void imprimirVolume() {
        System.out.println("Volume atual: " + volume);
    }
}
