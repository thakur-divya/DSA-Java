package HashMap;
import java.util.*;
public class Itinierary{

    //Find Itinearary for tickets
    public static String getStart(HashMap<String,String> map){
        HashMap<String,String> revMap = new HashMap<>();    // To -> From
        for(String key : map.keySet()){
            revMap.put(map.get(key),key);  //Key and values are reversed
        }

        for(String key : map.keySet()){
            if(!revMap.containsKey(key)){
                return key; //Starting Point
            }
        }

        return null;
    }
    public static void main(String[] args) {
        
        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai","Bengaluru");  //From -> To
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        String start = getStart(map);
        System.out.print(start);
        for(String key : map.keySet()){
            System.out.print(" -> " + map.get(start));
            start = map.get(start);
        }
    }
}