package Blind_75.Matrix;

import java.util.ArrayList;
import java.util.List;

public class Q3_Spiral_matrix {

    class Solution {

        private List<Integer> getSpiralOrderMatrix(int[][] matrix) {
            List<Integer> list = new ArrayList<>();

            int row = matrix.length;
            int col = matrix[0].length;

            int counter = row * col;

            int firstRow = 0;
            int lastRow = row - 1;
            int firstCol = 0;
            int lastCol = col - 1;

            while (counter > 0) {

                //first row
                for (int i = firstCol; i <= lastCol && counter-- > 0; i++) {
                    list.add(matrix[firstRow][i]);
                }
                firstRow += 1;

                //last column
                for (int i = firstRow; i <= lastRow && counter-- > 0; i++) {
                    list.add(matrix[i][lastCol]);
                }
                lastCol -= 1;

                //last row
                for (int i = lastCol; i >= firstCol && counter-- > 0; i--) {
                    list.add(matrix[lastRow][i]);
                }
                lastRow -= 1;

                //first column
                for (int i = lastRow; i >= firstRow && counter-- > 0; i--) {
                    list.add(matrix[i][firstCol]);
                    // counter -= 1;
                }
                firstCol += 1;
            }
            return list;
        }


        public List<Integer> spiralOrder(int[][] matrix) {
            return getSpiralOrderMatrix(matrix);
        }
    }
}
