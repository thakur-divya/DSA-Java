package ArrayList;
import java.util.*;

public class Container {
    public static int storeWater(ArrayList<Integer> height){
        //brute force
        int maxWater = 0;

        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int L1 = height.get(i);
                int L2 = height.get(j);

                int width = j-i;
                int ht = Math.min(L1,L2);

                int area = ht * width;

                if(area > maxWater){
                    maxWater = area;
                }
            }
        }
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

        System.out.println(storeWater(height));
    }
}
