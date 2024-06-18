package Enums;

public class SistemaIbge {
    public static void main(String[] args) {
      for(EstadoBrasileiro es : EstadoBrasileiro.values()){
            System.out.println(es.getEstadosSigla() + " - " + es.getEstadosNome() + ", " + es.getEstadosCodigo());
      }
      // System.out.println(EstadoBrasileiro.MINAS_GERAIS.getEstadosNome());
    }
} 