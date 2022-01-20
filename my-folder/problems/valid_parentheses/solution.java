class Solution {
    public boolean isValid(String s) {
     
        int n=s.length();
        HashMap<Character,Character> mappings=new HashMap();
        mappings.put(')','(');
        mappings.put('}','{');
        mappings.put(']','[');
        
        int i,j,k;
        
        Stack<Character> stack = new Stack<Character>();
        
        for( i=0;i<n;i++)
        {
            char c=s.charAt(i) ;
            if(mappings.containsKey(c))
            {
                
                //stack.push(mappings.get(c));
                char ch = stack.isEmpty() ? '#': stack.pop();
                
                if(ch != mappings.get(c))
                   return false;
            }
             else
                   stack.push(c);
        }
        
        return stack.isEmpty();
    }
    
    
}