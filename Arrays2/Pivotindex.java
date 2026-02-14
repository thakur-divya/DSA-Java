package Arrays2;
import java.util.*;

public class Pivotindex {
    public static int pivot(int nums[],int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int n,target;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        target = sc.nextInt();
        System.out.println(pivot(nums, target));
    }
}
