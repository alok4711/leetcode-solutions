class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] b=new boolean[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]=='1' && !b[i][j]){
                    ans++;
                    visit(grid, b, i, j);
                }
            }
        }
        return ans;
    }
    void visit(char[][] grid, boolean[][] b, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0' || b[i][j]==true) return;
        b[i][j]=true;
        visit(grid, b, i-1, j);
        visit(grid, b, i+1, j);
        visit(grid, b, i, j-1);
        visit(grid, b, i, j+1);
    }
}