class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        int ans=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value==1){
                ans=key;
            }
        }
        return ans;
    }
}