package treinos.test;

import java.util.ArrayList;
import java.util.List;

public class listTest01 {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>();
        List<String> listNames2 = new ArrayList<>();
        
        listNames.add("Nome 1");
        listNames.add("Nome 2");
        listNames.add("Nome 3");
        
        listNames2.add("Nome 4");
        listNames2.add("Nome 5");
        listNames2.add("Nome 6");

    
        listNames.addAll(listNames2);
        
        System.out.println("--------");
        for(int i = 0; i < listNames.size(); i++) {
            System.out.println(listNames.get(i));
        }
    }
}
