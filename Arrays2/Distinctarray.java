package Arrays2;

public class Distinctarray {
    public static boolean distinct(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j = i+1 ; j<arr.length ; j++){
            if(arr[j] == arr[i]){
                return false;
            }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,0,2,0};
        System.out.println(distinct(arr));
    }  
}
