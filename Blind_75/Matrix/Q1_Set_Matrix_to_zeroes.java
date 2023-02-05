package Blind_75.Matrix;

public class Q1_Set_Matrix_to_zeroes {

    class Solution {
        /**
         * Time Complexity - O(n)^2 + O(n)^2 ~= O(n)^2
         * Space Complexity - O(1)
         * @param matrix 2D Array
         */
        private void setMatrixToZeroes(int[][] matrix) {
            if (matrix == null) return;

            int row = matrix.length;
            int col = matrix[0].length;

            boolean[] rows = new boolean[row];
            boolean[] cols = new boolean[col];

            //find out if row or col contains zero or not
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] == 0) {
                        rows[i] = cols[j] = true;
                    }
                }
            }
            //set to zeros if current row or col contains zero
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (rows[i] || cols[j]) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        public void setZeroes(int[][] matrix) {
            setMatrixToZeroes(matrix);
        }

    }

}
