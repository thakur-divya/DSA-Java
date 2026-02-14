package TwoDArrays;

public class Numberofkey {
    public static int count7(int matrix[][],int key){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length-1; j++){
                if(key == matrix[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},
                      {3,7,9}};
        int key = 7;
        System.out.println(count7(matrix,key));
    }
}
