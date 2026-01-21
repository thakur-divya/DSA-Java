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

    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        n=sc.nextInt();
        Prime ob = new Prime();
        ob.inRange(n);

    }
}
