class Solution {
    public boolean isValid(String s) {
        
        HashMap<Character,Character> hmap = new HashMap();
        hmap.put('}','{');
        hmap.put(']','[');
        hmap.put(')','(');

        Stack<Character> st = new Stack();

        for(Character c:s.toCharArray())
        {
            if(hmap.containsKey(c))
            {
                Character topElement=(st.isEmpty())? '#':st.pop();

                if(topElement!= hmap.get(c))
                    return false;

            }
            else
              st.push(c);
            
        }
      
        return st.isEmpty();
    }
}