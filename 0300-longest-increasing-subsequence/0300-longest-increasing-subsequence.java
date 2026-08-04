class Solution {
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        int[][] dp=new int[len][len];
        int n=0;
        for(int i=0; i<len; i++){
            n=Math.max(n, helper(nums, i+1, i, nums[i], dp));
        }
        return 1+n;
    }
    int helper(int[] nums, int i, int prev, int num, int[][] dp){
        if(i==nums.length) return 0;
        if(dp[i][prev]!=0) return dp[i][prev];
        int take=0;
        if(num<nums[i]) take=1+helper(nums, i+1, i, nums[i], dp);
        int skip=helper(nums, i+1, prev, num, dp);
        return dp[i][prev]=Math.max(take, skip);
    }
}