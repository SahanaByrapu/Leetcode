class Solution {
    public boolean isPalindrome(String s) {
        

         for(int i=s.length()-1,j=0;j<i;i--,j++)
         {
            while(j<i && !(Character.isLetterOrDigit(s.charAt(j))))
                 j++;

            while(j<i && !(Character.isLetterOrDigit(s.charAt(i))))
                 i--;

            if(Character.toLowerCase(s.charAt(i))!=
               Character.toLowerCase(s.charAt(j)))
                 return false;
         }

        return true;
    }
}