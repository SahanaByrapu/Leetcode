class Solution {

   public int get(int n)
   {
       int totalsum=0;
       while(n>0) 
       {
           int p=n%10;
           n=n/10;
           totalsum+=p*p;
       }  
      
       return totalsum;
   }
     

    public boolean isHappy(int n) {

      int slow=n;
      int fast=get(n);
  
      while(slow!=fast && fast!=1)
      {
          slow=get(slow);
          fast=get(get(fast));
      }
 
      return fast==1;
    }
}