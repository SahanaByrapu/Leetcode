class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        int actualsum=(n*(n+1))/2;
        
        for (int i=0;i<nums.length;i++)
            actualsum-=nums[i];

        return actualsum;
        
    }
}