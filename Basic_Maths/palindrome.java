public class palindrome {
    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev * 10 + rem;
            n=n/10;
        }
        return (rev == temp);
    }
    public static void main(String[] args) {
        int n = 123;
        System.out.println(isPalindrome(n));
    }
}
