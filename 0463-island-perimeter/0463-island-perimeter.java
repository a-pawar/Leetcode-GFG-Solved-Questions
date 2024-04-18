public class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int perimeter = 0;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (grid[r][c] == 1) {
                    perimeter += 4;
                    if (r > 0 && grid[r - 1][c] == 1) { // Check up
                        perimeter -= 2;
                    }
                    if (c > 0 && grid[r][c - 1] == 1) { // Check left
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}