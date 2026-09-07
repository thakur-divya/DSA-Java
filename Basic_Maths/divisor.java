import java.util.*;
public class divisor {
    public static List<Integer> divisors(int n) {
        /*int arr[] = new int[n];
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
        return result;*/
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                list.add(i);

                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println((divisors(n)));
    }
}
