class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean[] b=new boolean[n+1];
        for(int i=0; i<n; i++){
            b[nums[i]]=true;
        }
        for(int i=0; i<n; i++){
            if(!b[i]) return i;
        }
        return n;
    }
}