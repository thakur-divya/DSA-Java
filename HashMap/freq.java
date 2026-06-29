package HashMap;
import java.util.*;

public class freq{
    public static TreeMap<Character,Integer> frequency(String str){
        TreeMap<Character,Integer> map = new TreeMap<>();
        
        //TreeMap uses Red Black Trees, sorts alphabetically wrt keys, O(log n)
        //Linked hashmap uses doubly linked list, sorts in insertion order, O(1)
        //HashMap in random order, O(1)
        for (char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0) + 1);
            }else{
                map.put(ch,1);
            }
        }
        /* 
        System.out.print("{");

        int count = 0;
        Set<Character> ch = map.keySet();
        for (char c : ch){
            System.out.print("'" + c + "'" + ":" + map.get(c));
            count++;
            if(count < map.size()){
                System.out.print(",");
            }
        }
        System.out.println("}}");
        */
        return map;
       
    }
    public static void main(String args[]){
        String str = "programming";
        System.out.println(frequency(str));
    }
}