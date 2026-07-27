class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1=version1.split("\\.");
        String[] s2=version2.split("\\.");
        int len=Math.max(s1.length, s2.length);
        for(int i=0; i<len; i++){
            int n1;
            int n2;
            if(i>=s1.length){
                n1=0;
                n2=Integer.parseInt(s2[i]);
            }
            else if(i>=s2.length){
                n1=Integer.parseInt(s1[i]);
                n2=0;
            }
            else{
                n1=Integer.parseInt(s1[i]);
                n2=Integer.parseInt(s2[i]);
            }
            if(n1>n2){
                return 1;
            }
            else if(n2>n1){
                return -1;
            }
        }
        return 0;
    }
}