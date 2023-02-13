class Solution {
    public int longestConsecutive(int[] nums) {
        
       Set<Integer> numset=new HashSet();
        if(nums.length==0)
         return 0;
       for (int n:nums)
        numset.add(n);

       int longstreak=1;
       for(int num:numset) 
       {
           if(!numset.contains(num-1))
           {
               int current=num;
               int currentstreak=1;

               while(numset.contains(current+1))
               { 
                 current+=1;
                 currentstreak+=1;
               }

               longstreak=Math.max(longstreak,currentstreak);

           }
       }

       /*
        
        int n=nums.length;

        Arrays.sort(nums);
        int LongStreak=1;
        int CurrentStreak=1;

        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                if(nums[i]==nums[i-1]+1)
                  CurrentStreak++;
                else
                 {
                     LongStreak=Math.max(LongStreak,CurrentStreak);
                     CurrentStreak=1;
                 }
            }
            

        }*/

        return longstreak;

    }
}