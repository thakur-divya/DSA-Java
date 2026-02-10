package BasicSorting;
//Time complexity is O(n2)
public class Bubblesort {
    public static void bubble(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            int swap=0;
            for(int j=0; j<arr.length-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    swap ++;

                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(swap == 0){
                System.out.println("No swapping needed already sorted");//Array already sorted
                break;
            }
        }
        System.out.println("new array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,5,7,9};
        bubble(arr);
    }
}
