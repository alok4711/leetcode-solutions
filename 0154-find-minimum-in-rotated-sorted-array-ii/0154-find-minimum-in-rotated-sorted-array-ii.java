class Solution {
    public int findMin(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    int helper(int[] nums, int l, int r){
        
        if(l==r) return nums[l];
        int mid=(l+r)/2;
        return Math.min(helper(nums, mid+1, r), helper(nums, l, mid));
    }
}