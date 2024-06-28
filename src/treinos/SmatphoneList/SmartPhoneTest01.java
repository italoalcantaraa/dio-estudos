package treinos.SmatphoneList;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneTest01 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("21830123", "Smartphone 1");
        Smartphone smartphone1 = new Smartphone("123212", "Smartphone 2");

        List<Smartphone> smartphones = new ArrayList<>();

        smartphones.add(smartphone);
        smartphones.add(smartphone1);

        for (Smartphone i : smartphones) {
            System.out.println(i);
        }

        for (Smartphone i : smartphones) {
            if(i.getName().contains("Smartphone 1"))
                System.out.println(true);
        }

        int index = smartphones.indexOf(smartphone1);
        System.out.println(index);
    }
}
