import java.math.BigDecimal;
import java.math.RoundingMode;
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        String s="";
        if((numerator<0 && denominator>0) || (numerator>0 && denominator<0)){
            s=s+"-";
        }
        long n=num/den;
        s=s+n;
        if(num%den==0) return s;
        s=s+'.';
        Map<Long, Integer> map=new HashMap<>();
        long rem=num%den;
        while(rem!=0){
            if(map.containsKey(rem)){
                int index=map.get(rem);
                s = s.substring(0, index) + "(" + s.substring(index)+")";
                break;
            }
            map.put(rem, s.length());
            rem=rem*10;
            n=rem/den;
            s=s+n;
            rem=rem%den;
        }
        return s;
    }
}