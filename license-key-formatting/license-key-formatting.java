class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
       //Right to Left traversal
        /*int n=s.length();
        StringBuilder sb = new StringBuilder();
        int count=0;
       for(int i=n-1;i>=0;i--)
       {
           if(s.charAt(i)!='-')
           {
              sb.append(Character.toUpperCase(s.charAt(i)));
              count++; 
                if(count==k)
                {
                    sb.append('-');
                    count=0;
                }
           }
       }

       if(sb.length()>0 && sb.charAt(sb.length()-1)=='-')
          sb=new StringBuilder(sb.substring(0,sb.length()-1));

    return sb.reverse().toString();*/

      //left to Right traversal
      int totalChars=0;
      int count1=0;

       for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='-')
                totalChars++;
        }

        
        int sizeOfFirstGroup=totalChars%k;
        if(sizeOfFirstGroup==0)
          sizeOfFirstGroup=k;

        StringBuilder ans = new StringBuilder();
        int j=0;
        for(j=0;j<s.length();j++)
        {
            if(count1==sizeOfFirstGroup)
            {
                count1=0;
                break;
            }
            if(s.charAt(j)!='-')
            {
                count1++;
                ans.append(Character.toUpperCase(s.charAt(j)));
            }
              
        }

        if(j>=s.length())
           return ans.toString();
        
        ans.append('-');
        
        while(j<s.length())
        {
            if(s.charAt(j)!='-')
            {
                
                if(count1==k)
                {
                    count1=0;
                    ans.append('-');
                }

                count1++;
                ans.append(Character.toUpperCase(s.charAt(j)));
            }
            j++;
         }


        return ans.toString();
    }
}