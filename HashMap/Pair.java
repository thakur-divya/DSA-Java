package HashMap;
import java.util.*;
public class Pair {
    public static int[] maxpair(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        int pairs = 0;
        for(int num : nums){
            if(set.contains(num)){
                pairs++;
                set.remove(num);
            }else{
                set.add(num);
            }
        }

        return new int[]{pairs,set.size()};
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,3,2,1,2};
        System.out.println(Arrays.toString(maxpair(nums)));
    }
}
