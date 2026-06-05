package HashMap;
import java.util.*;
public class HashSetLess {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //No duplicates only unique
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);

        System.out.println(set);
        set.remove(2);
        if(set.contains(2)){
            System.out.println("Yes 2 is there");
        }else{
            System.out.println("No 2 is not there");
        }

        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
