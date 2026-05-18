package Greedy;
import java.util.*;

//This is hard problem. Available in SPOJ.
public class Chocola {
    public static void main(String[] args) {
        int n = 4,m=6; //Total n rows and m cols are there
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int h = 0, v = 0; //h and v are pointers or indices to CostHor and CostVer
        int hp = 1, vp =1; //Horizontal and Vertical Pieces
        int cost = 0;

        while(h < costHor.length && v < costVer.length){
            if (costVer[v] <= costHor[h]) { //Horizontal cut is bigger in value
                cost += (costHor[h] * vp);
                h++;
                hp++;
            }else{ //Verical Cut is happening
                cost += (costVer[v] * hp);
                v++;
                vp++;
            }
        }
        while(h < costHor.length){
            cost += (costHor[h] * vp);
            h++;
            hp++;
        }
        while(v < costVer.length){
            cost += (costVer[v] * hp);
            v++;
            vp++;
        }

        System.out.println("Min cost of cuts in Chocolate is " + cost);
    }
}
