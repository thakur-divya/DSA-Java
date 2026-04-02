package ArrayList;

import java.util.ArrayList;
public class PairSum2 {
    /*Find the pair sum of target element inside a roatated and sorted ArrayList */
    
    public static boolean Sum(ArrayList<Integer> list, int target){
    
        int n = list.size();
        int bp = -1;

        for(int i=0;i<n;i++){
            if(list.get(i) > list.get(i+1)){
                bp = i; //This is my breaking point
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;
        //Modular arithmetic is applied which is used in Advance DSA Concepts
        while(lp != rp){
            //case 1
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }
            //case 2
            if(list.get(lp)+list.get(rp) < target){
                lp = (lp+1)%n; //remember
            }
            //case 3
            else{
                rp = (n+rp-1)%n; //remember
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Note that elements are Sorted and Rotated

        //11 15 6 7 9 10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(10);
        
        int target = 16;

        System.out.println(Sum(list, target));
    }
}
