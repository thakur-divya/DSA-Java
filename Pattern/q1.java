import java.util.*;
public class q1{
    public void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void rightangled(int n){  
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void invertedtriangle(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pyramid(int n){
        for(int i=0;i<n;i++){
            for(int k=i;k<n-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void floyd(int n){
        int c=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<(i+1);j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
    public void pascal(int n){
        for(int i=0;i<n;i++){
            for(int k=i;k<n;k++){
                System.out.print(" ");
            }
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num + " ");
                num = num * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
    public static void simplepascal(int n){
        for(int i=0;i<n;i++){
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num + " ");
                num = num * (i-j)/(j+1);
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        q1 ob = new q1();
        int n=sc.nextInt();
        //ob.pattern1(n);
        //ob.rightangled(n);
        //ob.invertedtriangle(n);
        //ob.pyramid(n);
        //ob.number(n);
        //ob.floyd(n);
        ob.pascal(n);
        ob.simplepascal(n);    
    }
}