class Solution {
    public int firstMissingPositive(int[] nums) {
        // Arrays.sort(nums);
        // int x=1;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]<1) continue;
        //     if(i>0 && nums[i]==nums[i-1]) continue;
        //     else if(x==nums[i]) x++;
        //     else return x;
        // }
        // return x;

        int n=nums.length;
        boolean[] b=new boolean[n+1];
        for(int i=0; i<n; i++){
            if(nums[i]>0 && nums[i]<=n){
                b[nums[i]]=true;
            }
        }
        for(int i=1; i<=n; i++){
            if(!b[i]) return i;
        }
        return n+1;
    }
}