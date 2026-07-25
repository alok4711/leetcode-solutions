class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        int ans=0;
        for(String ch:tokens){
            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int q=s.pop();
                int p=s.pop();
                switch (ch) {
                    case "+":
                        ans=p+q;
                        s.push(ans);
                        break;
                    case "-":
                        ans=p-q;
                        s.push(ans);
                        break;
                    case "*":
                        ans=p*q;
                        s.push(ans);
                        break;
                    case "/":
                        ans=p/q;
                        s.push(ans);
                        break;
                }
            }
            else{
                int num = Integer.parseInt(ch);
                s.push(num);
            }
        }
        return s.pop();
    }
}