// You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if ((mat.length == r && mat[0].length == c) || mat.length*mat[0].length != r*c)
            return mat;
        int[][] arr = new int[r][c];
        for (int i=0, x=0, y=0; i<mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                if (y==c) {
                    y=0;
                    x++;
                }
                arr[x][y++] = mat[i][j];                
            }
        }
        return arr;
        
    }
}