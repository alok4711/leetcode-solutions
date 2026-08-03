class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h_index=0;
        int idx=1;
        for(int i=citations.length-1; i>=0; i--){
            if(citations[i]>=idx) h_index=idx;
            else break;
            idx++;
        }
        return h_index;
    }
}