class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] ans=new int[2];
        int idx=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]) i++;
            else ans[idx++]=nums[i];
        }
        if(idx==1) ans[1]=nums[nums.length-1];
        return ans;
    }
}