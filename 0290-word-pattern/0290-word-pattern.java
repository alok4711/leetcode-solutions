class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map=new HashMap<>();
        Map<String, Character> mapArr=new HashMap<>();
        String[] arr = s.split(" ");
        if(arr.length!=pattern.length()) return false;
        for(int i=0; i<arr.length; i++){
            if(map.get(pattern.charAt(i))==null) map.put(pattern.charAt(i), arr[i]);
            else if(!map.get(pattern.charAt(i)).equals(arr[i])) return false;
            if(mapArr.get(arr[i])==null) mapArr.put(arr[i], pattern.charAt(i));
            else if(mapArr.get(arr[i])!=pattern.charAt(i)) return false;
        }
        return true;
    }
}