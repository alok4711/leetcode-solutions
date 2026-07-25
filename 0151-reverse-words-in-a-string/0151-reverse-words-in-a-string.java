class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        String ans="";
        for(String str:arr){
            ans=str+" "+ans;
        }
        ans = ans.trim();
        return ans;
    }
}