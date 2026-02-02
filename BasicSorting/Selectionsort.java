package BasicSorting;

public class Selectionsort {
    public static void selection(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos]>arr[i]){
                    minpos=j;
                }

            }
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,9,8,1,7};
        selection(arr);
        
    }
}
