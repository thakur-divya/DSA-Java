public class armstrong {
    public static boolean isArmstrong(int n) {
        int count = 0;
        int temp = n;
        int extra = n;
        while(n > 0){
            n = n/10;
            count++;
        }

        int sum = 0;
        while(temp > 0){
            int last = temp%10;
            sum = sum + (int)Math.pow(last,count);
            temp = temp/10;
        }
        return (sum == extra);
    }
    public static void main(String[] args) {
        int n=135;
        System.out.println(isArmstrong(n));
    }
}
