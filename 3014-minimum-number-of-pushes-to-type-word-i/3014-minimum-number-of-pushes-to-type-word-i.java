class Solution {
    public int minimumPushes(String word) {
        int ans=0;
        int n=1;
        int len=word.length();
        while(len!=0){
            if(len>8){
                ans+=(8*n);
                n++;
                len-=8;
            }
            else{
                ans+=(len*n);
                len=0;
            }
        }
        return ans;
    }
}