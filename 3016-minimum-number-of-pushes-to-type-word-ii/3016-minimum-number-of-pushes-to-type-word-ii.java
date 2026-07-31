class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq); 
        int pos=0;
        int cost=0;
        for(int i = 25; i >= 0; i--){
            cost+=((pos/8)+1)*freq[i];
            pos++;
        }
        return cost;
    }
}