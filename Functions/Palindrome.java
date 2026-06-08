package Functions;
import java.util.Scanner;

public class Palindrome {

    //Valid Palindrome Leetcode q 125 using 2 pointers
    public static boolean valid(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;     //Skip any extra chars except alphanumeric
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }

    public static void main(String args[]){
        int n,temp,rev;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        temp = n;
        rev = palindrome( n);
        if(rev == temp){
            System.out.println(n+ " is palindrome ");
        }
        else{
            System.out.println(n + "is not palindrome");
        }

        System.out.println(valid("A man, a plan, a canal: Panama"));

    }
    public static int palindrome(int n){
        int ld,rev,temp;
        rev = 0;
        temp = n;
        while(n>0){
            ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        return rev;
    }}

