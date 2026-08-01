class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;
    public MyQueue() {
        in=new Stack<>();
        out=new Stack<>();
    }
    
    public void push(int x) {
        while(!out.isEmpty()){
            in.push(out.pop());
        }
        in.push(x);
        while(!in.isEmpty()){
            out.push(in.pop());
        }
    }
    
    public int pop() {
        return out.pop();
    }
    
    public int peek() {
        return out.peek();
    }
    
    public boolean empty() {
        return out.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */