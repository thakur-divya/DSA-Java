package Greedy;
import java.util.*;
public class FracKnapsack {
    //Classical Fractional Knapsack Problem using Greedy Approach
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];

        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        //Sorting in ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int finalVal = 0;
        int capacity = W;
        for(int i=ratio.length-1;i>=0;i--){ //bcz ratio is in asc order we want higher ratio first
            
            int idx = (int)ratio[i][0]; //Storing Index
            if(capacity >= weight[idx]){   // total include
                capacity -= weight[idx];
                finalVal += val[idx];
            }else{
                finalVal += (ratio[i][1] * capacity); //include fractional part
                capacity = 0;
                break;
            }
        }

        System.out.println("maximum value = " + finalVal);
    }
}
