class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        int maxlen=0;
        while(j<s.length()){
            if(!set.add(s.charAt(j))){
                maxlen=Math.max(maxlen, set.size());
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(s.charAt(i));
                i++;
                set.add(s.charAt(j));
            }
            j++;
        }
        maxlen=Math.max(maxlen, set.size());
        return maxlen;
    }
}