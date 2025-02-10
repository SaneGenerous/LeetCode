package Medium;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    boolean isValidSudoku = true;
    public void isValidSudoku(char[][] board) {
        outer: for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    checkRep(board, i, j);
                }
                if(!isValidSudoku) break outer;
            }
        }
        System.out.println(isValidSudoku);
    }
    void checkRep(char[][] board, int i, int j){
        for(int b = 0; b < 9; b++){
            if (b != j && board[i][b] == board[i][j]) {
                isValidSudoku = false;
                return;
            }
        }
        for(int a = 0; a < 9; a++){
            if (a != i && board[a][j] == board[i][j]) {
                isValidSudoku = false;
                return;
            }
        }
        int s = 0, q = 0;
        if(i > 5) s = 6;
        else if(i > 2) s = 3;
        if(j > 5) q = 6;
        else if(j > 2) q = 3;
        for(int c = s; c <= s+2; c++){
            for(int d = q; d <= q+2; d++){
                if (c != i && d != j && board[c][d] == board[i][j]) {
                    isValidSudoku = false;
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        char[][] board = {{'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','6','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','8','.','.','.','.'},
                {'9','.','.','.','7','5','.','.','.'},
                {'.','.','.','.','5','.','.','8','.'},
                {'.','.','9','.','.','.','.','.','.'},
                {'2','.','6','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}};
        ValidSudoku validSudoku = new ValidSudoku();
        validSudoku.isValidSudoku(board);
    }
}
