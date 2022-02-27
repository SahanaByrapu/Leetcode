class Solution {
    
    public String transformString(String s)
    {
        int i,j,k;
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder build = new StringBuilder();
        for(i=0,j=0;i<s.length() ;i++)
        {
            char c1=s.charAt(i);
            if(!map.containsKey(c1))
              map.put(c1,i);
            
            build.append(Integer.toString(map.get(c1)));
            build.append(" ");
        }
       
        return build.toString();
    }
    public boolean isIsomorphic(String s, String t) {
      
       if(transformString(s).equals(transformString(t)))
          return true;
       else
          return false;
    }
}