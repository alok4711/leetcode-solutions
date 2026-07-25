class Solution {
    public int candy(int[] ratings) {
        int[] candy=new int[ratings.length];
        Arrays.fill(candy, 1);
        for(int i=1; i<candy.length; i++){
            if(ratings[i]>ratings[i-1]) candy[i]=1+candy[i-1];
        }
        for(int i=candy.length-2; i>=0; i--){
            if(ratings[i]>ratings[i+1]) candy[i]=Math.max(candy[i], 1+candy[i+1]);
        }
        int ans=0;
        for(int c:candy){
            ans+=c;
        }
        return ans;
    }
}