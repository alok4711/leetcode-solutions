class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int count=1;
        while(n!=0){
            int unique=9;
            int can_place=9;
            for(int i=1; i<n; i++){
                unique*=can_place--;
            }
            count+=unique;
            n--;
        }
        return count;
    }
}