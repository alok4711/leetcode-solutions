class Solution {
    public int maxProduct(int n) {
        int p=n%10;
        n=n/10;
        int q=n%10;
        n=n/10;
        int ans=p*q;
        while(n!=0){
            p=Math.max(p, q);
            q=n%10;
            n=n/10;
            ans=Math.max(ans, p*q);
        }
        return ans;
    }
}