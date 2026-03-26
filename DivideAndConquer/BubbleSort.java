package DivideAndConquer;
 //Optimized Bubble Sort
public class BubbleSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void bubble(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,3,5,1,6,0,2,7};
        bubble(arr);
        printArr(arr);
    }
}
