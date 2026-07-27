class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        while(!columnTitle.equals("")){
            ans*=26;
            ans+=columnTitle.charAt(0)-'A'+1;
            columnTitle=columnTitle.substring(1);
        }
        return ans;
    }
}