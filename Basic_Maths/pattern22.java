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
    }
}
