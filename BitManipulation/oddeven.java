package BitManipulation;
import java.util.*;
public class oddeven {
    public static void odev(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println(n + " is an even no ");
        }
        else{
            System.out.println(n + " is an odd no ");
        }
    }
    public static void main(String args[]){
        System.out.println("Performing bit manipulation to find out even odd");
        odev(3);
        odev(8);
    }
}
