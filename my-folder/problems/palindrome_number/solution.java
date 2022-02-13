class Solution {
    public boolean isPalindrome(int x) {
       
        int n=0,y=x;
        while(x>0)
        {
            n=n*10+ x%10;
            x=x/10;
        }
        
        if(n==y)
            return true;
        else 
            return false;
    }
}