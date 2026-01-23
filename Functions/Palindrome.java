package Functions;
import java.util.Scanner;

public class Palindrome {
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

