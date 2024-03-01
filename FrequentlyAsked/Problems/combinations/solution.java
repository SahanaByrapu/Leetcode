class Solution {
    
    List<List<Integer>> output = new LinkedList();
        int n,k;
    public void backtrack(int first, LinkedList<Integer> curr) {
        
         if(curr.size()==k)
             output.add(new LinkedList(curr));
          
          for(int i=first;i<=n;i++)
           {
             curr.add(i);
             backtrack(i+1,curr);
             curr.removeLast();
           }
             
      }
    
    
     public List<List<Integer>> combine(int n, int k) {
     this.n=n;
     this.k=k;
     backtrack(1,new LinkedList<Integer>());
     return output;
    }
}      
     
  