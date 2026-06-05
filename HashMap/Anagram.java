package HashMap;

import java.util.*;

//Valid Anagram q in which 2 strings are containing same no of letters and same letter
public class Anagram {   //O(N)

    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int j=0;j<t.length();j++){
            char ch = t.charAt(j);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.remove(map.get(ch) - 1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s = "tulip";
        String t = "care";
        System.out.println(isAnagram(s,t));
    }
}
