class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n=s.length(),maxlen=0;
        
        HashMap<Character,Integer> hmap = new HashMap();
        for(int i=0,j=0;i<n;i++)
        {
            if(hmap.containsKey(s.charAt(i)))
                j=Math.max(j,hmap.get(s.charAt(i)));
                
           maxlen=Math.max(maxlen,i-j+1);
           hmap.put(s.charAt(i),i+1);
           
        }
        
        return maxlen;
    }
}