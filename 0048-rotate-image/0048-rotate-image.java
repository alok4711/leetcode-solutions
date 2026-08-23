class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0; i<n/2; i++){
            int l=i;
            int r=(n-1)-i;
            for(int j=0; j<m; j++){
                int temp=matrix[j][l];
                matrix[j][l]=matrix[j][r];
                matrix[j][r]=temp;
            }
        }
        for(int i=m-2; i>=0; i--){
            for(int j=0; j<(n-1)-i; j++){
                int k=(n-1)-j;
                int l=(n-1)-i;
                int temp=matrix[i][j];
                matrix[i][j]=matrix[k][l];
                matrix[k][l]=temp;
            }
        }
    }
}