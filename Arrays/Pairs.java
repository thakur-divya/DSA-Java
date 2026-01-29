package Arrays;

public class Pairs {
    //Time complexity is O(n2)

    public static void printpairs(int numbers[]){
        int tp=0;
        for(int i=0;i<=numbers.length-1;i++){
            int curr = numbers[i]; //2,4,6,8
            for(int j=i+1;j<=numbers.length-1;j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs in Array : " + tp);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printpairs(numbers);
    }
}
