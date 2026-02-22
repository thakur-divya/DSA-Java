package Strings;

import java.util.*;

//Anargrams
public class Pracsec {
    public static void main(String[] args) {
        String str1 = "racee";
        String str2 = "care";

        //string to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
        //string to char array
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        
        //sorting arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean result = Arrays.equals(ch1, ch2);
        if(result){
            System.out.println("The given two strings are anargrams ");
        }
        else{
            System.out.println("The given two strings are not anargrams");
        }
    }
    else{
        System.out.println("The given two strings are not anargrams");
    }
    }
}
