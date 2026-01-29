package Arrays;

public class Subarray {
    public static void printsubarray(int numbers[]){
        int tp=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i;j<numbers.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){

                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                    
                }
                System.out.print("      Sum : "+sum);
                tp++;
                System.out.println();
            }
            System.err.println();
        }
        System.out.println();   
        System.out.println("Total Pairs : " + tp);
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10};
        printsubarray(numbers);
    }
}
