class Solution {
    
     
    public int lengthOfLongestSubstring(String s) {
     int n = s.length();
     int []charfreq = new int[128];   
     int res=0,left=0,right=0;
        
       while(right < s.length())
      {
           char r = s.charAt(right);
           charfreq[r]++;
           while(charfreq[r] > 1) {
               char l=s.charAt(left);
               charfreq[l]--;
               left++;
           }
           
          res=Math.max(res,right-left+1);
          right++;
       }
     
        return res; 

    }
    
   
}