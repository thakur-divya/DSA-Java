package Backtracking;
//Find the no of ways to reach from (0,0) to (n-1,m-1) in nxm grid. only allowed move is right and down
//Time complexity is O(2^n+m) not optimised slow run good for small data
public class grid {
    // use formula (n-1m-1)!/(n-1)!*(m-1)! to convert into linear time O(n+m)
    public static int gridways(int i,int j,int n,int m){
        //base case
        if(i == n-1 && j==m-1){
            return 1;
        }
        else if(i >=n || j>=m){ //handling corner case
            return 0;
        }
        //kaam
        int w1 = gridways(i+1, j, n, m);
        int w2 = gridways(i,j+1,n,m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridways(0,0, n, m));
    }
}
