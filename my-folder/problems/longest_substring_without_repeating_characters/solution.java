class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       int n=s.length();   
       int left=0;
       int right=0;
       int res=0;

      HashMap<Character,Integer> hmap = new HashMap();
       
       //Sliding window
       /*while(right<n)
       {
           char r= s.charAt(right);
           hmap.put(r,hmap.getOrDefault(r,0)+1);

           while(hmap.get(r)>1) 
           {
               char p=s.charAt(left);
               hmap.put(p, hmap.get(p)-1);
               left++;
           }

           res=Math.max(res,right-left+1);
           right++;
       }*/


       //Sliding window-optimized
       int res1=0;
       for(int j=0,i=0;j<n;j++)
       {
           if(hmap.containsKey(s.charAt(j)))
                i=Math.max(i,hmap.get(s.charAt(j)));
            
            res1=Math.max(res1,j-i+1);
            hmap.put(s.charAt(j),j+1);

       }

        return res1;
    }
}