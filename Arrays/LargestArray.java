package Arrays;

public class LargestArray {
    public static int getlargest(int numbers[]){
        int index=0;
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
                index=i;
            }
        }
        System.out.println("Largest found at index : " + (index + 1));
        return largest;
    }   
    public static void main(String[] args) {
        int numbers[]={23,78,34,89,20,1,54,73,42};
        int largest = getlargest(numbers);
        System.out.println("Largest no in array is : " + largest);
    } 
}
