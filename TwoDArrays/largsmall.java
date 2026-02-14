package TwoDArrays;

import java.util.Scanner;

public class largsmall {
    public static int largest(int matrix[][]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i< matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                if( matrix[i][j] > max){
                    max = matrix[i][j];
                    
                } 
            }
        }
        return max;
    }
    public static int smallest(int matrix[][]){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i< matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                if( matrix[i][j] < min ){
                    min = matrix[i][j];
                    
                } 
            }
        }
        return min;
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
        System.out.println("Largest element in matrix is " + largest(matrix));
        System.out.println("Smallest element in matrix is " + smallest(matrix));
    }
}
