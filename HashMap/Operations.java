
package HashMap;
import java.util.*;
public class Operations {

    public static void main(String[] args) {
        
    //HashMaps are Unordered sets
    HashMap<String,Integer> hm = new HashMap<>();
    
    //Insert Operation - O(1)
    hm.put("India", 43);
    hm.put("China", 50);
    hm.put("Africa", 30);
    System.out.println(hm);

    //Get Operation - O(1)
    System.out.println(hm.get("India"));
        //if valid then gives value otherwise null
    System.out.println(hm.get("Indonesia"));


    //Contains Key
    hm.containsKey("India");
    System.out.println(hm.containsKey("India"));
    System.out.println(hm.containsKey("Indonesia"));

    //Remove - O(1) remove key and returns its value otherwise return null
    System.out.println(hm.remove("India"));
    System.out.println(hm);

    //TO Know the size
    System.out.println(hm.size());

    //To know isEmpty
    hm.clear();  //HashMap ko clear kar diya
    System.out.println(hm.isEmpty());
    }
}
