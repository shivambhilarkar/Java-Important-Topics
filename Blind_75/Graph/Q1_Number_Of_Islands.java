package Blind_75.Graph;

public class Q1_Number_Of_Islands {

    class Solution {

        private boolean validPosition(char[][] grid, int row, int col) {
            if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != '1') {
                return false;
            }
            return true;
        }

        private void searchIsland(char[][] grid, int r, int c) {
            if (!validPosition(grid, r, c)) {
                return;
            }

            grid[r][c] = '0'; //this will act as visited cell;
            searchIsland(grid, r + 1, c);
            searchIsland(grid, r, c + 1);
            searchIsland(grid, r - 1, c);
            searchIsland(grid, r, c - 1);
        }

        private int getIslands(char[][] grid) {
            if (grid == null) return 0;

            int counter = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        searchIsland(grid, i, j);
                        counter += 1;
                    }
                }
            }
            return counter;
        }


        public int numIslands(char[][] grid) {
            return getIslands(grid);
        }
    }
}
