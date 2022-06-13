class Solution {
    public int lengthOfLongestSubstring(String s) {
        
      int n=s.length() ; 
       
      HashMap<Character,Integer> map=new HashMap<Character,Integer>();
      int maxlen=0; 
      for(int right=0,left=0;right<n;right++)
      {
        if(map.get(s.charAt(right)) != null)
            left= Math.max(map.get(s.charAt(right))+1,left);
          map.put(s.charAt(right),right); 
          maxlen=Math.max(maxlen,right-left+1);
       }  
          
     return maxlen; 
      }
    
    }