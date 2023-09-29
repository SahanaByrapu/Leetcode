class Solution {
    public void moveZeroes(int[] nums) {
        
        int lastzerofound=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
              nums[lastzerofound++]=nums[i];
        }

        for(int i=lastzerofound;i<nums.length;i++)
         nums[i]=0;


         return;

    }
}