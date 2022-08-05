class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> s1= new Stack<>();
        int n=s.length();
        
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            
            if(ch == '(' || ch =='{' || ch=='[')
                s1.add(ch);
            
            else
            {
                char chr='#';
                if(s1.isEmpty()) return false;
                 chr=s1.pop();
                
                if ((ch==']'  &&  chr != '[') ||(ch =='}' &&  chr!='{') ||  
                      (ch ==')' &&  chr!='(') ) 
                 return false;
                    
            }
            
        }
        
       return s1.isEmpty();
            
    }
}