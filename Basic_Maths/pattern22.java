public class pattern22 {
    public static void main(String[] args) {
        int n = 3;
        int matrix = 2*n-1;
        for(int i=1;i<= matrix;i++){
            for(int j=1;j<=matrix;j++){
                int min = Math.min(Math.min(i-1,j-1),Math.min(matrix-i,matrix-j));
                System.out.print(n-min);
            }
            System.out.println();
        }

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1 || i==4 || j==1 || j==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=2*(4-i);k>0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=3;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(4-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=4;i>=1;i--){
            //left
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            //spaces
            for(int k=0;k<2*(4-i);k++){
                System.out.print(" ");
            }
            //right
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            //left
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            //spaces
            for(int k=0;k<2*(4-i);k++){
                System.out.print(" ");
            }
            //right
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
