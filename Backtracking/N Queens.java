public class Solution {
	
		
public static void placeNQueens(int n){
		int[][] board = new int[n][n];
		placeQueen(board, 0);
	}
    
    private static void placeQueen(int[][] board, int row){
        int n = board.length;
        if(row == n){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
            return ;
        }
        for(int i = 0; i < n; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 1;
                placeQueen(board, row+1);
                board[row][i] = 0;
            }
        }
    }
    
    private static boolean isSafe(int[][] board, int row, int col){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 1){
                    if(i == row || j == col)
                        return false;
                    if((i-j) == (row-col) || (i+j) == (row+col))
                        return false;
                }
            }
        }
        return true;
    }
	
}
