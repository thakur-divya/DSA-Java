public class gcd {
    public static int GCD(int n1, int n2) {
        while(n2 != 0){
            int temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        return n1;
    }
    public static void main(String[] args) {
        int n1=4;
        int n2=8;
        System.out.println(GCD(n1, n2));
    }
}
