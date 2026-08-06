class Solution {
    int[] dp;
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.fill(dp, -2);
        Arrays.sort(coins);
        return helper(coins, amount);
    }
    int helper(int[] coins, int amount){
        if(amount==0) return 0;
        if(dp[amount]!=-2) return dp[amount];
        int count=Integer.MAX_VALUE;
        for(int i=coins.length-1; i>=0; i--){
            if(coins[i]<=amount){
                int res=helper(coins, amount-coins[i]);
                if (res != -1) count = Math.min(count, res+1);
            }
        }
        if(count==Integer.MAX_VALUE) return dp[amount]=-1;
        return dp[amount]=count;
    }
}