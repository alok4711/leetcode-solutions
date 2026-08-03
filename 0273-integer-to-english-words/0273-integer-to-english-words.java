class Solution {
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        String[] below20={"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens={"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        int n=0;
        String ans="";
        while(num!=0){
            if(n==1 && num%1000!=0){
                if(ans=="") ans="Thousand";
                else ans="Thousand "+ans;
            }
            if(n==2 && num%1000!=0){
                if(ans=="") ans="Million";
                else ans="Million "+ans;
            }
            if(n==3 && num%1000!=0){
                if(ans=="") ans="Billion";
                else ans="Billion "+ans;
            }
            if(num>=100 && num%1000!=0){
                int digits=num%1000;
                if(digits%100==0){
                    digits/=100;
                }
                else if(digits%100<20){
                    if(ans=="") ans=below20[digits%100];
                    else ans=below20[digits%100]+" "+ans;
                    digits/=100;
                }
                else{
                    if(digits%10!=0){if(ans=="") ans=below20[digits%10];
                        else ans=below20[digits%10]+" "+ans;
                    }
                    digits/=10;
                    if(ans=="") ans=tens[digits%10];
                    else ans=tens[digits%10]+" "+ans;
                    digits/=10;
                }
                if(digits!=0){
                    if(ans=="") ans=below20[digits]+" Hundred";
                    else ans=below20[digits]+" Hundred "+ans;
                }
                num/=1000;
            }
            else{
                int digits=num%100;
                if(digits%100==0){
                    digits/=100;
                }
                else if(digits%100<20){
                    if(ans=="") ans=below20[digits%100];
                    else ans=below20[digits%100]+" "+ans;
                }
                else{
                    if(digits%10!=0){if(ans=="") ans=below20[digits%10];
                        else ans=below20[digits%10]+" "+ans;
                    }
                    digits/=10;
                    if(ans=="") ans=tens[digits%10];
                    else ans=tens[digits%10]+" "+ans;
                }
                num/=1000;
            }
            n++;
        }
        return ans;
    }
}