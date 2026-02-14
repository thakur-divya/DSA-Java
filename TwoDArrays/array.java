package TwoDArrays;
import java.util.*; 
public class array {
    public static boolean search(int matrix[][], int key){
        for(int i = 0;i< matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                if( matrix[i][j] == key){
                    System.out.print("Found at cell " + i + "," + j);
                    return true;
                } 
            }
        }
        System.out.print("Not found ");
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println("Enter the elemrnts : ");
        for(int i = 0;i< n ; i++){
            for(int j=0; j<m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i< n ; i++){
            for(int j=0; j<m ; j++){
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }
        search(matrix, 9);
    }
}
