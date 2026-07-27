class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int ans=0;
        int value=0;
        for(int key:map.keySet()){
            if(value<map.get(key)){
                value=map.get(key);
                ans=key;
            }
        }
        return ans;
    }
}