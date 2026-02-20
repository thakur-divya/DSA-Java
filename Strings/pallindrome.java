package Strings;
import java.util.*;

public class pallindrome {
    public static boolean check(String str){
      
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i) != (str.charAt(str.length()-i-1))){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string : ");
        str = sc.next();

        System.out.println(check(str));
    }
}
