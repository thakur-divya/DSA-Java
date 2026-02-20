package Strings;
import java.util.*;

public class pallindrome {
    public static boolean check(String str){
        String rev = "";
        for(int i=str.length() - 1 ; i>=0; i--){
            rev = rev + str.charAt(i); 
        }
        if(str .equals (rev)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string : ");
        str = sc.next();

        System.out.println(check(str));
    }
}
