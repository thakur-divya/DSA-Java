package Arrays2;

public class Prefixmaxsum {
    public static void maxsum(int numbers[]){
        int cursum;
        int maxSum=Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();

        for(int i=0;i<prefix.length;i++){
            int start = i;
            cursum=0;
            for(int j=i;j<prefix.length;j++){
                int end =j;
                
                cursum = (start==0) ? prefix[end] : prefix[end]-prefix[start-1];

                if(cursum > maxSum){
                    maxSum = cursum;
                }
            }
            
        } System.out.println("max sum is : " + maxSum);        
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxsum(numbers);
    }
}
