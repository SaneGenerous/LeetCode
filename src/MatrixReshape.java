import java.util.Arrays;

public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c) return mat;
        int[][] matrix = new int[r][c];
        int a =0, b = 0;
        for(int i =0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[a][b] = mat[i][j];
                if(b == c-1){
                    b = 0;
                    a++;
                } else b++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] mat = new int[1][4];
        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[0][2] = 3;
        mat[0][3] = 4;
        System.out.println(Arrays.deepToString(new MatrixReshape().matrixReshape(mat, 2, 2)));
    }
}
