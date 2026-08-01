class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if(nums.length==0) return list;
        int n=nums[0];
        for(int i=1; i<=nums.length; i++){
            if(i==nums.length || nums[i]-1!=nums[i-1]){
                if(nums[i-1]==n){
                    list.add(n+"");
                    if(i<nums.length) n=nums[i];
                }
                else{
                    list.add(n+"->"+nums[i-1]);
                    if(i<nums.length) n=nums[i];
                }
            }
        }
        return list;
    }
}