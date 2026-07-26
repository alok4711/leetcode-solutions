class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int p=nums[n-1];
        int q=nums[n-2];
        int r=nums[n-3];
        return Math.max(p*q*r, p*nums[0]*nums[1]);
    }
}