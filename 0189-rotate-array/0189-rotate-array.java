class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k%=len;
        int[] arr=new int[k];
        int j=0;
        for(int i=len-k; i<len; i++){
            arr[j++]=nums[i];
        }
        for(int i=len-1; i>=k; i--){
            nums[i]=nums[i-k];
        }
        for(int i=0; i<k; i++){
            nums[i]=arr[i];
        }
    }
}