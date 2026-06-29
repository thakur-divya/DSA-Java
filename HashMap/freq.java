package HashMap;
import java.util.*;

public class freq{
    public static HashMap<Character,Integer> frequency(String str){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0) + 1);
            }else{
                map.put(ch,1);
            }
        }
       return map;
    }
    public static void main(String args[]){
        String str = "Programming";
        System.out.println(frequency(str));
    }
}