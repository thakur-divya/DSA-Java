package DynamicProgramming;
public class Knapsack {
    
    public static int knap(int val[],int wt[],int W,int i){
        
        if(W == 0 || i == 0){
            return 0;
        }

        if(wt[i] <= W){ //valid
            //include
            int ans1 = val[i] + knap(val, wt, W-wt[i], i-1);
            //exclude
            int ans2 = knap(val, wt, W, i-1);
            return Math.max(ans1, ans2);
        }else{
            //Not Valid
            return knap(val, wt, W, i-1);
        }
        
    }
    public static void main(String[] args) {
    int val[] = {15,14,10,45,30};
    int wt[] = {2,5,1,3,4};
    int W = 7;
    int idx = val.length-1;
    System.out.println(knap(val, wt, W, idx));
    }
}
