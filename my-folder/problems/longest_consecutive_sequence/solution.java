class Solution {
    public int longestConsecutive(int[] nums) {
     
        int n=nums.length;
        
        HashSet<Integer> hashset = new HashSet<Integer>();
        
        for(int i=0;i<n;i++)
            hashset.add(nums[i]);
        
        if(hashset.size() == 1) return 1;
        
        int currentstreak=0,maxstreak=0;
        for(Integer num : hashset )
        {
            if(!hashset.contains(num-1))
            {
                int current=num;
                currentstreak=1;
                int i=1;
                while(hashset.contains(num+i))
                {
                    currentstreak++;
                    i++;
                }
                
              maxstreak= Math.max(currentstreak,maxstreak);
            }
            
        }
        
        return maxstreak;
        
    }
}