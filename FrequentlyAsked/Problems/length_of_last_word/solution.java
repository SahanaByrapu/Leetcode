class Solution {
    public int lengthOfLastWord(String s) {

       int end=s.length(),length=0;

       while(end>0)
       {
          end--;
          
          if(s.charAt(end)!=' ')
            length++;
          else if(length>0)
            return length;
         
         
       }

        return length;
    }
}