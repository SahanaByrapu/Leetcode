class Node{
    
    int val;
    int del;
   
    Node(int val, int del)
    {
        this.val=val;
        this.del=del;
    }
}
class StockSpanner {

    Stack<Node> stk = new Stack<Node>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
      
        int count=0;
        while(!stk.isEmpty() && stk.peek().val <=price)
        {
            count+=stk.peek().del;
            stk.pop();
        }
        count++;
        stk.add(new Node(price,count));
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */