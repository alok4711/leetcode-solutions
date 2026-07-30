class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map=new HashMap<>();
        Map<Character, Character> map2=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map2.get(t.charAt(i))!=null && map2.get(t.charAt(i))!=s.charAt(i)) return false;
            else map2.put(t.charAt(i), s.charAt(i));
            if(map.get(s.charAt(i))!=null && map.get(s.charAt(i))!=t.charAt(i)) return false;
            else map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
}