class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean[] b = new boolean[n];
        for(int i=2; i<n; i++){
            if(!b[i]){
                for(int j=i*2; j<n; j+=i){
                    b[j]=true;
                }
            }
        }
        for(int i=2; i<n; i++){
            if(!b[i]) count++;
        }
        return count;
    }
}