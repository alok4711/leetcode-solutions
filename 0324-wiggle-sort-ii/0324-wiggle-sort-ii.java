class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int[] temp=nums.clone();
        int even=0;
        int odd=len/2;
        if(len%2!=0) odd=(len+1)/2;
        for(int i=len-1; i>=0; i--){
            if(i%2==0) nums[i]=temp[even++];
            else nums[i]=temp[odd++];
        }
    }
}