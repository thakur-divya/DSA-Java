package DivideAndConquer;
 //Optimized Bubble Sort 
 //Best case time comp can be O(n) and worst case is O(n2) if optimized using boolean swapped variable
//In simple bubble sort both worst and best case is O(n2)
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
            boolean swapped = false;
            for(int j=0;j<n-1-i;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
            if(swapped == false){
                    System.out.println("Already Sorted" + " ");
                    return;
                }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        bubble(arr);
        printArr(arr);
    }
}
