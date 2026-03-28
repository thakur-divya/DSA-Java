package Backtracking;
public class NQueens {
//Time Complexity is O(n!)
    public static boolean issafe(char board[][],int row,int col){
        //Checking vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //Checking diag left up
        for(int i = row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //Checking diag right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }


    public static void nqueens(char board[][],int row){
        //base case
        if(row == board.length){
            printBoard(board);
            return;
        }
        //columns 
        for(int j=0;j<board.length;j++){
            if(issafe(board, row, j)){
                board[row][j] = 'Q';
                nqueens(board, row+1);
                board[row][j] = '.';
            }
        }
    }


    public static void printBoard(char board[][]){
    System.out.println("------Chess Board------");
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        //Initialise
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        nqueens(board, 0);
    }
}
