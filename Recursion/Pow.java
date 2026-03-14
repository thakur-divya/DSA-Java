package Recursion;

public class Pow {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = power(x,n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x,n));
    }
}
