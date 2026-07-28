class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder f = new StringBuilder();
        String m="";
        StringBuilder l = new StringBuilder();
        for(int i=0; i<26; i++){
            if(freq[i]==0) continue;
            if(freq[i]%2!=0) m+=(char)(i+'a');
            for(int j=0; j<freq[i]/2; j++){
                f.append((char)(i+'a'));
                l.insert(0, (char)(i+'a'));
            }
        }
        String ans=f+m+l;
        return ans;
    }
}