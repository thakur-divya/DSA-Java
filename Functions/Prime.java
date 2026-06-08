import java.util.*;
class Prime{

    public boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        
        for(int i=2;i<=n/2;i++){
                if(n%i == 0){
                    return false;
                }
        }
            
        return true;
    }
    public  void inRange(int n){

        int i;

        for( i =1; i<=n; i++){

            if(isPrime(i)){

                System.out.println(i);
            }
        }
    }

    //Simple Approach
    public static int simple(int n){
        int count = 0;
        for(int i=2;i<=n;i++){
            boolean prime = true;
            for(int j=2;j*j<=i;j++){
                if(i%j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                count++;
            }
        }
        return count;
    }
    //Sieve of Eratosthenes Primes in Range leetcode q. 
    public static int isPriminRange(int n){
        int count = 0;
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2;i*i<=n;i++){
           
            if(isPrime[i]){
                for(int j=i*i ; j <= n; j+=i){
                    isPrime[j] = false;
                }
           }
        }

        for(int i=0;i<isPrime.length;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int n;
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        n=sc.nextInt();
        Prime ob = new Prime();
        ob.inRange(n);
        System.out.println("");
        */
        System.out.println(isPriminRange(10));
        System.out.println(simple(10));
    }
}
