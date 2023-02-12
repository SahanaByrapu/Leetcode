class Solution {
    public int rob(int[] nums) {
        
        int N=nums.length;
        int[]maxrobbed=new int[N+1];
        maxrobbed[N]=0;
        maxrobbed[N-1]=nums[N-1];

        for(int i=N-2;i>=0;i--)
         maxrobbed[i]=Math.max(maxrobbed[i+1],maxrobbed[i+2]+nums[i]);
        

        return maxrobbed[0];
    }
}