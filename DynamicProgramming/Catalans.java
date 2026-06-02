package DynamicProgramming;

public class Catalans {               

    public static int Cat(int n){   //Using Recursion
        if(n==0 || n==1){
            return 1;
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += Cat(i) * Cat(n-i-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Cat(n));
    }
}
