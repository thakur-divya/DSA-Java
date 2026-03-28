package Backtracking;

public class Permutation {
    public static void findpermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            //recursion
            char curr = str.charAt(i); //fetching current character
            //"abcde" = "ab" + "de"
            String Newstr = str.substring(0,i) + str.substring(i + 1);
            findpermutation(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        findpermutation(str,"");
    }
}
