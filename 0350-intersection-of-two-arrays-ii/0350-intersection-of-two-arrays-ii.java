class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1=new HashMap<>();
        HashMap<Integer, Integer> map2=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums1){
            map1.put(num, map1.getOrDefault(num, 0)+1);
        }
        for(int num:nums2){
            map2.put(num, map2.getOrDefault(num, 0)+1);
        }
        for(int key:map1.keySet()){
            if(map2.get(key)!=null){
                int n=Math.min(map1.get(key), map2.get(key));
                for(int i=0; i<n; i++){
                    list.add(key);
                }
            }
        }
        int len=list.size();
        int[] ans=new int[len];
        for(int i=0; i<len; i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}