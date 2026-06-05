package HashMap;

import java.util.*;

public class Majority {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,2,7,2,8,1,2,2,2,2};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            /*
             if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }else{
                map.put(arr[i],1);
            }
            */
            //Instead of if-else
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }


        //Also for (Integer elem : map.keySet());
        Set<Integer> keySet = map.keySet();
        for (Integer elem : keySet) {
            if(map.get(elem) > arr.length/3){
                System.out.println(elem);
            }
        }
    }
}
