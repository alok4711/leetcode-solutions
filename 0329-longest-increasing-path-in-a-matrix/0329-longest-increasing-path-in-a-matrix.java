class Solution {
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        dp=new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans=Math.max(ans, helper(matrix, i, j));
            }
        }
        return ans;
    }
    int helper(int[][] matrix, int i, int j){
        if(dp[i][j]!=-1) return dp[i][j];
        int u=0;
        int d=0;
        int r=0;
        int l=0;
        if(i<matrix.length-1 && matrix[i+1][j]>matrix[i][j]) u=helper(matrix, i+1, j);
        if(i>0 && matrix[i-1][j]>matrix[i][j]) d=helper(matrix, i-1, j);
        if(j<matrix[0].length-1 && matrix[i][j+1]>matrix[i][j]) r=helper(matrix, i, j+1);
        if(j>0 && matrix[i][j-1]>matrix[i][j]) l=helper(matrix, i, j-1);
        return dp[i][j]= 1+Math.max(u, Math.max(d, Math.max(r, l)));
    }
}