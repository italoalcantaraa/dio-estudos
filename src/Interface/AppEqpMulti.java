package Interface;

import Interface.copiadora.Copiadora;
import Interface.digitalizadora.Digitalizadora;
import Interface.equipamenteMultifuncional.EquipamentoMultifuncional;
import Interface.impressora.Deskjet;
import Interface.impressora.Impressora;
import Interface.impressora.Laserjet;

public class AppEqpMulti {
    public static void main(String[] args) {
        EquipamentoMultifuncional equipamenteMultifuncional = new EquipamentoMultifuncional();

        Impressora impressora = equipamenteMultifuncional;
        impressora.Imprimir();

        Digitalizadora digitalizadora = equipamenteMultifuncional;
        digitalizadora.Digitalizar();

        Copiadora copiadora = equipamenteMultifuncional;
        copiadora.Copiar();
    
    }
}
