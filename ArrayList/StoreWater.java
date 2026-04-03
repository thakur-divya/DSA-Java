import java.util.*;
public class StoreWater {
    public static int store(ArrayList<Integer> height,int lp,int rp){
        int maxWater = 0;
        while(lp < rp){
            int width = rp - lp;
            int ht = Math.min(height.get(lp),height.get(rp));
            int curWater = ht * width;
            maxWater = Math.max(maxWater,curWater);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }//returning maxwater
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(store(height,0,height.size()-1));
    }
}
