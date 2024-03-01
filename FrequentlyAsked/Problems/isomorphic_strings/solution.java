class Solution {

    public String transformString(String s)
    {
        HashMap<Character,Integer> hmap_s_t=new HashMap();
        StringBuilder builder=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
             char c1=s.charAt(i);
             if(!hmap_s_t.containsKey(c1))
                hmap_s_t.put(c1,i);

              builder.append(Integer.toString(hmap_s_t.get(c1))+" ");  
               
         }
       
        return builder.toString();

    }
    public boolean isIsomorphic(String s, String t) {

        return transformString(s).equals(transformString(t));
        
        

    }
}