class MyQueue {
     Stack<Integer> stk1=new Stack<Integer>();
     Stack<Integer> stk2=new Stack<Integer>();
     int x;
    public MyQueue() {
       x=0;
    }
    
    public void push(int x) {
       stk1.push(x); 
    }
    
    public int pop() {

      if(!stk1.isEmpty())
      {
           while(!stk1.isEmpty()) 
                stk2.push(stk1.pop());
                
           if(!stk2.isEmpty())
             x=stk2.pop();

           while(!stk2.isEmpty())
             stk1.push(stk2.pop());
      }
         
        return x;
    
    }
    
    public int peek() {
      
      if(!stk1.isEmpty())
      {
        while(!stk1.isEmpty()) 
                stk2.push(stk1.pop());

           if(!stk2.isEmpty())
            x=stk2.peek();

           while(!stk2.isEmpty())
             stk1.push(stk2.pop());
       
      }
        

        return x;
        
    }
    
    public boolean empty() {
        
        return stk1.isEmpty();
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