class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hset=new HashSet();

        for(int i=0;i<nums.length;i++)
            hset.add(nums[i]);

        int currstreak=0,maxstreak=0;
        for(int i=0;i<nums.length;i++)
        {

            //checking if the number is starting of the sequence
            if(!hset.contains(nums[i]-1))
            {
                currstreak=0;
               
               while(hset.contains(nums[i]+currstreak))
                currstreak++;

            }
            
            maxstreak=Math.max(currstreak,maxstreak);
        }

        return maxstreak;
    }
}