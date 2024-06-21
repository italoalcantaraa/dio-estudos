package Interface.equipamenteMultifuncional;

import Interface.copiadora.Copiadora;
import Interface.digitalizadora.Digitalizadora;
import Interface.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
    public void Copiar() {
        System.out.println("Digitalizadora: Copiando...");
    }
    public void Digitalizar(){
        System.out.println("Digitalizadora: Digitalizando...");
    }
    public void Imprimir() {
        System.out.println("Digitalizadora: Imprimindo...");
    }

}
