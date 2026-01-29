package Arrays;
public class Binarysearch {
    /*Time complexity of binary search is O(log n) */
    public static int binarysearch(int numbers[],int key){
        int start=0;
        int end=numbers.length+1;
        while(start<=end){
            int mid=(start + end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,45,67,89,90};
        int key=45;
        System.out.println("Element found at index : " + binarysearch(numbers, key));
    }
}
