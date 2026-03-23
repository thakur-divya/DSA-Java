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
    public static int optimizedpower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optimizedpower(x, n/2);
        int halfoptimized = halfpower * halfpower;

        if(n % 2 != 0){
            halfoptimized = x * halfoptimized;
        }
        return halfoptimized;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(optimizedpower(x, n));
    }
}
