public class tiling {
    public static int tilingproblem(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical case
        int fnm1 = tilingproblem(n-1);

        //horizontal case
        int fnm2 = tilingproblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main (String args[]){
        System.out.print(tilingproblem(4));
    }
}
