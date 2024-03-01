class Solution {
    public String reverseWords(String a) {
        
        char[]s=a.toCharArray();
        int len=a.length();
        int lastSpaceindex=-1;
        for(int start=0;start<=len;start++)
        {
          if(start==len || s[start]==' ')
          {
            int startIndex=lastSpaceindex+1;
            int endIndex=start-1; 
            while(startIndex<endIndex)
            {
             char temp=s[startIndex];
             s[startIndex++]=s[endIndex];
             s[endIndex--]=temp;
            }

             lastSpaceindex=start;
          }

         
        }

        return new String(s);
    }
}