class Solution {
    public boolean backspaceCompare(String s, String t) {
       
    int skip1=0, skip2=0;
    int i=s.length()-1, j=t.length()-1;

    while(i>=0 || j>=0)
    {
      while(i>=0)
      {
         if(s.charAt(i)=='#')
         {
             skip1++;
             i--;
         }
         else if(skip1>0)
         {
             skip1--;
             i--;
         }
         else break;
      }

      while(j>=0)
      { 
          if(t.charAt(j)=='#')
           {
               skip2++;
               j--;
           }
           else if(skip2>0)
           {
               skip2--;
               j--;
           }
           else break;
      }

     if(i>=0 && j>=0 && s.charAt(i)!=t.charAt(j)) return false;
     
     if(i>=0^j>=0) return false;
     
     i--;j--;
    }

    return true;
    }
      
}