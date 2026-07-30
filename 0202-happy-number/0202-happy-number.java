class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(n<5) return false;
        int num=0;
        while(n!=0){
            int a=n%10;
            a*=a;
            num+=a;
            n/=10;
        }
        return isHappy(num);
    }
}