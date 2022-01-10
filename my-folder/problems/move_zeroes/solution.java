class Solution {
    public void moveZeroes(int[] nums) {
        
        int n=nums.length-1;
        int lastNonZeroFoundAt=0;
        for(int i=0;i<=n;i++)
        {
            if(nums[i]!=0)
                nums[lastNonZeroFoundAt++]=nums[i];
        }
        
        for(int i=lastNonZeroFoundAt;i<=n;i++)
           nums[i]=0;
    }
}