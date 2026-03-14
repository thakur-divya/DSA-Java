package Recursion;

public class firstoccurence {
    public static int firstocc(int arr[], int key, int i){
        if(i == 0){//i==0 for last and i==arr.length-1 for first occurence
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstocc(arr, key, i-1);//i-1 for decrement in last occurence and i+1 for firstoccurence
    }
    public static void main(String[] args) {
        int arr[]= {1,8,3,5,6,5,9};
        System.out.println(firstocc(arr, 5, arr.length-1));// 0 for first and arr.length-1 for last occurence
    }
}
