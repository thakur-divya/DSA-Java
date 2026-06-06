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

        //Iterations on HashSets
        //1. Using Iterator
        HashSet<String> cities = new HashSet<>();
        cities.add("India");
        cities.add("Mumbai");
        cities.add("Telangana");

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("");
        //2. Using Advanced Loop
        for (String city : cities){
            System.out.print(city + " ");
        }
        System.out.println("");

        //Using LinkedHashSet and TreeSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("India");
        lhs.add("Mumbai");
        lhs.add("Telangana");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("Mumbai");
        ts.add("Telangana");
        System.out.println(ts);
    }
}
