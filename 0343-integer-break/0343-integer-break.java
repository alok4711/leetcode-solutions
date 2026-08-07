class Solution {
    int[] dp;
    public int integerBreak(int n) {
        dp=new int[n+1];
        return helper(n);
    }
    int helper(int n){
        if(dp[n]!=0) return dp[n];
        if(n==2 || n==1) return dp[n]=1;
        int ans=1;
        for(int i=(n/2)+(n%2); i>=1; i--){
            ans=Math.max(ans, i*(n-i));
            ans=Math.max(ans, i*helper(n-i));
        }
        return dp[n]=ans;
    }
}