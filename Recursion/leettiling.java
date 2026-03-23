import java.util.*;
class  leettiling{
    public static int numTilings(int n) {
        //base case
        if(n==0 || n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        //vertical
        int fnm1 = numTilings(n-1);
        //horizontal
       
        //tromino tiling
        int fnm3 = numTilings(n-3);

        int totWays =  2*fnm1 + fnm3;
        return totWays;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(numTilings(n));
    }
} 
