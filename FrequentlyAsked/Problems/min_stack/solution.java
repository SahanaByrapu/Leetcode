class MinStack {

    Stack<Integer> stk = new Stack<>();
    Stack<Integer> minstk = new Stack<>();
    int top;
    public MinStack() {
        
    }
    
    public void push(int val) {
       
        stk.add(val);
        if(minstk.isEmpty() || val<=minstk.peek() )
            minstk.add(val);
    }
    
    public void pop() {
        if(stk.peek().equals(minstk.peek()))
           minstk.pop();
        stk.pop();
    }
    
    public int top() {
       return stk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */