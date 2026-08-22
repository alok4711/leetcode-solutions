class Solution {
    public boolean checkDivisibility(int n) {
        int x=n;
        int sum=0;
        int prod=1;
        while(x!=0){
            int digit=x%10;
            sum+=digit;
            prod*=digit;
            x/=10;
        }
        if(n%(sum+prod)==0) return true;
        else return false;
    }
}