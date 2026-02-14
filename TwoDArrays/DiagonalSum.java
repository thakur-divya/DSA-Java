package TwoDArrays;

public class DiagonalSum {
    public static int printDiagonal(int matrix[][]){
         int sum = 0;
        int n = matrix.length;
        for(int i=0; i<=n-1; i++){
            //Primary Diagonal
            sum += matrix[i][i];
            //Seconadary diagnol
            if(i != n-1-i){
                sum += matrix[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
        System.out.println(printDiagonal(matrix));

    }
}
