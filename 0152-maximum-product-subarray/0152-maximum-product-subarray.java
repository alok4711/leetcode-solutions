class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            ans=Math.max(ans, helper(nums, i));
        }
        return ans;
    }
    int helper(int[] nums, int n){
        int ans=Integer.MIN_VALUE;
        int product=1;
        for(int i=n; i<nums.length; i++){
            product*=nums[i];
            ans=Math.max(ans, product);
        }
        return ans;
    }
}