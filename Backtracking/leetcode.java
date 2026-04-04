package Backtracking;

import java.util.*;
public class leetcode {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        if(x < 0){
            return false;
        }
        while(x != 0){
        int rem = x % 10;
        x = x / 10;
        rev = rev * 10 + rem;
        }
        if(rev == temp){
            return true;
        }

        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        leetcode ob = new leetcode();
        System.out.println(ob.isPalindrome(x));
    }
} 
    

