class Solution {
    public String getHint(String secret, String guess) {
        int a=0;
        int b=0;
        Map<Character, Integer> secretCow=new HashMap<>();
        Map<Character, Integer> guessCow=new HashMap<>();
        for(int i=0; i<secret.length(); i++){
            char ch=secret.charAt(i);
            secretCow.put(ch, secretCow.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<guess.length(); i++){
            char ch=guess.charAt(i);
            guessCow.put(ch, guessCow.getOrDefault(ch, 0)+1);
        }
        for(char ch: secretCow.keySet()){
            if(guessCow.containsKey(ch)) b+=Math.min(guessCow.get(ch), secretCow.get(ch));
        }
        for(int i=0; i<secret.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)) a++;
        }
        b-=a;
        return a+"A"+b+"B";
    }
}