package Greedy;
import java.util.*;

//Maximum length of Chain of Pairs Similar to Activity Selection
public class MaxLenOfChain {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1])); //Asc order of 2nd end of pair
        //O(NlogN)
        int chainLen = 1;
        int chainEnd = pairs[0][1]; //Storing by default 1st Pair
        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0] > chainEnd){ //Starting of next > End of lastend
                chainLen++;
                chainEnd = pairs[i][1];
            } 
        }
        System.out.println("Max chains that can be formed = " + chainLen);
    }
}
