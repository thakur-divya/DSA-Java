import java.util.*;
public class divisor {
    public static int[] divisors(int n) {
        int arr[] = new int[n];
        int idx = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                arr[idx] = i;
                idx++;
            }
        }

        int result[] = new int[idx];
        for(int i=0;i<idx;i++){
            result[i] = arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(Arrays.toString(divisors(n)));
    }
}
