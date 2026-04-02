package ArrayList;

import java.util.ArrayList;
public class PairSum2 {
    public static boolean Sum(ArrayList<Integer> list, int target){
        int lp,rp;
        int n = list.size();

        for(int i=0;i<n;i++){
            if(list.get(i) < list.get(i+1)){
                continue;
            }
            else{
                rp = i;
                lp =i+1;

                 //Modular arithmetic is applied which is used in Advance DSA Concepts
                while(lp != rp){
                    //case 1
                    if(list.get(lp)+list.get(rp) == target){
                        return true;
                    }
                    //case 2
                    else if(list.get(lp)+list.get(rp) < target){
                        lp = (lp+1)%n;
                    }
                    //case 3
                    else{
                        rp = (n+rp-1)%n;
                    }
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Note that elements are Sorted and Rotated
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
