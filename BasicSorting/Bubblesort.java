package BasicSorting;

public class Bubblesort {
    public static void bubble(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length ; j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("new array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,9,2,1,6};
        bubble(arr);
    }
}
