package HashMap;

import java.util.*;

public class Iterations {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("India", 43);
        hm.put("China", 50);
        hm.put("Africa", 30);


        //Iterate
        //Can use hm.entry(); same but in loop we can perform operations
        System.out.println(hm.entrySet());

        
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key=" + k +  "  Value=" + hm.get(k));
        }
    }
}
