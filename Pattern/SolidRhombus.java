package Pattern;

public class SolidRhombus {
    public static void Rhombus(int n){
        int i,j,k;
        for(i=1;i<=n;i++){
            //spaces
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(k=1;k<=5;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Rhombus(5);
    }
}
