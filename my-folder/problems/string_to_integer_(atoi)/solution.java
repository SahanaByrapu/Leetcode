class Solution {
    public int myAtoi(String s) {
      
        int sign=1;
        int index=0;
        int n=s.length();
        int res=0;
        while(index<n && s.charAt(index)==' ') index++;
        if(index<n && s.charAt(index)=='-') {sign=-1;index++;}
        else if(index<n && s.charAt(index)=='+') {sign=1;index++;}
        
        while(index<n && Character.isDigit(s.charAt(index)))
        {
            int digit =s.charAt(index)-'0';
            
            if( res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 &&                    digit>Integer.MAX_VALUE%10)  )
               return sign==1?  Integer.MAX_VALUE :Integer.MIN_VALUE;
            
            
         res=res*10+digit;
         index++;  
            
        }
        
       return sign*res; 
    }
}