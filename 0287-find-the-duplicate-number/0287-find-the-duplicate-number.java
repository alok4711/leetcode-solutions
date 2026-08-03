class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        boolean[] b=new boolean[n];
        for(int i=0; i<n; i++){
            if(b[nums[i]]) return nums[i];
            b[nums[i]]=true;
        }
        return n;
    }
}