package HashMap;
import java.util.*;

public class freq{
    public static void frequency(String str){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0) + 1);
            }else{
                map.put(ch,1);
            }
        }

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
        System.out.print("}");

       
    }
    public static void main(String args[]){
        String str = "Programming";
        frequency(str);
    }
}