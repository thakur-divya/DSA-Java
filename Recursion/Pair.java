public class Pair {
    public static int fp(int n){
        if(n==1 || n==2){
            return n;
        }
        //kamm
        //single
        int fnm1 = fp(n-1);
        //pairing
        int fnm2 = fp(n-2);
        int pairWays = (n-1)*fnm2;
        int totWays = fnm1 + pairWays;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(fp(3));
    }
}
