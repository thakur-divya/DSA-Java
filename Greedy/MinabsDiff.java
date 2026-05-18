package Greedy;
import java.util.*;
public class MinabsDiff {
    //Minimum Absolute Difference Of Pairs
    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};
        //Time comp of this ques is O(NlogN)
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum Absolute Difference of Pairs = " + minDiff);
    }
}
