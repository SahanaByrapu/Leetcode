class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
          return false;

        int[]count=new int[26];
        int pointer=0;
        while(pointer<s.length())
        {
           count[s.charAt(pointer)-'a']++;
           count[t.charAt(pointer)-'a']--;
           pointer++;
        }

       for(int c:count)
       {
         if(c!=0)
           return false;
       }

       return true;

    }
}