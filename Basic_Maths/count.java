package Basic_Maths;
class count {
    public static int countDigit(int n) {
        int count=0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println(countDigit(n));
    }
}