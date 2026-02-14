package TwoDArrays;

public class SumSecondrow {
    public static int Secondrow(int matrix[][]){
        int sum = 0 ;
        for(int j=0 ; j<matrix[0].length; j++){
            
                sum += matrix[1][j];
        }
    return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
    System.out.println(Secondrow(matrix));
}
}