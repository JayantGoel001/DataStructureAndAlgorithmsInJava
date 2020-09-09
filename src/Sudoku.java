public class Sudoku {
    public static void main(String[] args) {
        int[][] board = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        sudoku(board,0,0);


    }

    public static void sudoku(int[][] board,int row,int col){
        if (row == 9){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }
        if (col == 9){
            sudoku(board,row+1,0);
            return;
        }
        if (board[row][col]==0){
            for (int i = 1; i <=9 ; i++) {
                if (isSafe(board,row,col,i)) {
                    board[row][col] = i;
                    sudoku(board, row, col + 1);
                    board[row][col] = 0;
                }
            }
        }else{
            sudoku(board, row, col+1);
        }

    }

    private static boolean isSafe(int[][] board, int row, int col, int i) {

        for (int j = 0; j < 9; j++) {
            if (board[row][j] == i){
                return false;
            }
        }
        for (int j = 0; j < 9; j++) {
            if (board[j][col]==i){
                return false;
            }
        }
        row = row - row%3;
        col = col - col%3;
        for (int j = row; j < row+3; j++) {
            for (int k = col;k <col+3; k++) {
                if (board[j][k]==i){
                    return false;
                }
            }
        }
        return true;
    }
}
