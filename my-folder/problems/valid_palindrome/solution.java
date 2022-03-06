class Solution {
    public boolean isPalindrome(String s) {
       
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        int count=0,i,j;
        for(i=0,j=s.length()-1;i<j;i++,j--)
        {
            if(s.charAt(i)==s.charAt(j))
                count++;
        }
        
        if(count==i)
            return true;
        else
            return false;
        
    }
}