import java.util.*;
public class Pracq2 {
    public void practice(int number){
            if(number == 0){
                return ;
            }
            
            int last = number%10;
            practice(number/10);
            switch(last){
                case 0 : System.out.print("zero" + " ");
                         break;
                case 1 : System.out.print("one" + " ");
                         break;
                case 2 : System.out.print("two" + " ");
                         break;
                case 3 : System.out.print("three" + " ");
                         break;
                case 4 : System.out.print("four" + " ");
                         break;
                case 5 : System.out.print("five" + " ");
                         break;
                case 6 : System.out.print("six" + " ");
                         break;
                case 7 : System.out.print("seven" + " ");
                         break;
                case 8 : System.out.print("eight" + " ");
                         break;
                case 9 : System.out.print("nine" + " ");
                         break;
            }
            
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int dig = number % 10;
        if(dig != 0){
            Pracq2 ob = new Pracq2();
            ob.practice(number);
        
        }
}}
