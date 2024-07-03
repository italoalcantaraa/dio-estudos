package Collection_Framework_API.treino;

import java.util.HashMap;
import java.util.Map;

/**
 * ex1
 */
public class ex1 {
    public static void main(String[] args) {
     Map<String, String> map = new HashMap<>();
     
     map.put("user", "Maria");
     map.put("1234", "Fernando");

    //  System.out.println(map.get("user"));

    for (String key : map.keySet()) {
        System.out.printf("\n{Key: %s, value: %s},", key, map.get(key));
    }

    }
}