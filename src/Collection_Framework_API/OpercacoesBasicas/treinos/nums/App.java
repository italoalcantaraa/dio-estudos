package Collection_Framework_API.OpercacoesBasicas.treinos.nums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(100);
        nums.add(33);
        nums.add(22);
        nums.add(55);
        nums.add(93);
        nums.add(12);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        Collections.sort(nums);
        // Collections.sort(nums, Collections.reverseOrder());

        System.out.println("--------------------");

        // Com ordenação
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }
}
