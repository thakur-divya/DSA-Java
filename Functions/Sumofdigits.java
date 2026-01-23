package Functions;
import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    n = sc.nextInt();
    System.out.println("The required sum is : " + sumofdig( n));

}
    public static int sumofdig(int n){
        int sum =0;
        while(n!=0){
            int lastdigit = n %10;
            sum = sum + lastdigit;
            n = n/ 10;
        }
        return sum ;
    }
}
