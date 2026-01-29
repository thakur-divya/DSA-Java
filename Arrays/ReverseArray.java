package Arrays;
public class ReverseArray {
    //Time Complexity is O(n) and space complexity is O(1)
    public static void revarr(int numbers[]){
        int first = 0, last = numbers.length-1;
        while(first < last){
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,5,7,9};
        revarr(numbers);
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
