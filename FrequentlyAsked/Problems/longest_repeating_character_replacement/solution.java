class Solution {
    public int characterReplacement(String s, int k) {
        
       /*int low=1;
       int high=s.length()+1;

        while(low+1 < high)
        {
            int mid =low+(high-low)/2;
            if(isSubstringValid(s,mid,k))
               low=mid;
            else
              high=mid;

        }

        return low; */

       int start=0;
       int[]frequencymap =new int[26];
       int maxfreq=0;
       int longestSubstringlength=0;

       for(int end=0;end<s.length();end++)
       {
          int current=s.charAt(end)-'A';
          frequencymap[current]+=1;
          maxfreq=Math.max(maxfreq,frequencymap[current]);
          
          if( !(end+1-start-maxfreq <= k))
          {
              int para=s.charAt(start)-'A';
              frequencymap[para]-=1;
              start+=1;
          }
        
          longestSubstringlength=end+1-start;

        }

        return longestSubstringlength;
    }

   public boolean isSubstringValid(String s,  int susbstringlength,int k)
   {
       int []freq= new int[26];
       int maxfreq=0;
       int start=0;
       for(int end=0;end<s.length();end++)
       {
           freq[s.charAt(end)-'A']+=1;

           if((end+1-start)>susbstringlength)
            {
                freq[s.charAt(start)-'A']-=1;
                start+=1;
            }


           maxfreq=Math.max(maxfreq,freq[s.charAt(end)-'A']);
           if(susbstringlength-maxfreq <=k)
              return true;

       }
   
      return false;
   }

}