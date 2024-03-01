class Solution {

    public boolean checkPalindrome(String s, int start,int end)
    {
       while(start<end)
       {
           if(s.charAt(start)!=s.charAt(end))
             return false;

            start++;
            end--;
       }

       return true;
    }
    public boolean validPalindrome(String s) {

       for(int i=0,j=s.length()-1;i<j;i++,j--)
       {
           if(s.charAt(i)!=s.charAt(j))
             return checkPalindrome(s,i,j-1) || checkPalindrome(s,i+1,j);
              
       } 

      return true;
    }
}