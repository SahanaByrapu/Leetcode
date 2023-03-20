class Solution {
    public int strStr(String haystack, String needle) {
        
        int m=haystack.length();
       int n=needle.length();
        int j;
        for(int i=0;i<m+1-n;i++)
        { 
          for(j=0;j<n;j++)
          {  
            if(haystack.charAt(i+j) != needle.charAt(j)) break;
            
           }
            
           if(j==n) return i;    
        }
        
       return -1;

    }
}