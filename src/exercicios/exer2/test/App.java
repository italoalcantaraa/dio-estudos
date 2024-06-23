package exercicios.exer2.test;

import exercicios.exer2.dominio.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Progresso");
        iphone.ligar("212312");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("idnsaoidnod/sdasds/asdads");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
    }
}
