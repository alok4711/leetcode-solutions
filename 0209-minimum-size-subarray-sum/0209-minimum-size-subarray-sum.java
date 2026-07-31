class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=1;
        int ans=nums.length+1;
        int sum=nums[0];
        while(l<=r && l<nums.length && r<=nums.length){
            if(sum<target){
                if(r<nums.length) sum+=nums[r++];
                else break;
            }
            else if(sum>target){
                ans=Math.min(ans, r-l);
                sum-=nums[l++];
            }
            else if(sum==target){
                ans=Math.min(ans, r-l);
                if(r<nums.length)sum+=nums[r++];
                sum-=nums[l++];
            }
        }
        if(ans>nums.length) return 0;
        return ans;
    }
}