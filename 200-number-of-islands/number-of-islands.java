class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int totalIslands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    totalIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        return totalIslands;
    }

    private void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (i < 0 || i > rows - 1 || j < 0 || j > cols - 1 || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0'; // Update the value to '0' to mark as visited

        dfs(grid, i, j - 1);
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
    }
}
