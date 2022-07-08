class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       
        int n=nums.length,maxlength=0,count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 1)
                count+=1;
            else 
            {
                 maxlength=Math.max(maxlength,count) ;  
                 count=0;
            }
        }
        
        return Math.max(maxlength,count);
    }
}