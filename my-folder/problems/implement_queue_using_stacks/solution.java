class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int front,rear;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        
        if(s1.isEmpty())
            front=x;
        
        s1.add(x);
    }
    
    public int pop() {
       
     if(s2.isEmpty())
     {
       while(!s1.isEmpty())
         s2.add(s1.pop());
     }
        int x=s2.pop();
       return x; 
    }
    
    public int peek() {
      
        if(!s2.isEmpty())
          return s2.peek(); 
        else
          return front;
        
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
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