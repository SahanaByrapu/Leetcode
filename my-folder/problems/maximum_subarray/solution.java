class Solution {
    public int maxSubArray(int[] nums) {
        
     int i,j,k,sum=nums[0],maxsum=nums[0];
     
     for(i=1;i<nums.length;i++)
     {
       sum=Math.max(nums[i],sum+nums[i]);
       maxsum=Math.max(maxsum,sum) ; 
     }
        
     return maxsum;
    }
}