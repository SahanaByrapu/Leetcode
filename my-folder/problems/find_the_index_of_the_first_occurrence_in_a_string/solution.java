class Solution {
    public int strStr(String haystack, String needle) {
        
       int m=haystack.length();
       int n=needle.length();
        
        for(int i=0;i<m+1-n;i++)
        { 
          int j =0;
          for(;j<n;j++)
          {  
            if(haystack.charAt(i+j) != needle.charAt(j)) break;
            
           }
            
           if(j==n) return i;    
        }
        
       return -1;
    }
}