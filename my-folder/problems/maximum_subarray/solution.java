class Solution {
    public int maxSubArray(int[] nums) {
      int currentsubarray=nums[0];
      int maxsubarray=nums[0];
      for(int i=1;i<nums.length;i++)
      {
          int num=nums[i];
          currentsubarray=Math.max(num,currentsubarray+num);
          maxsubarray=Math.max(maxsubarray,currentsubarray);
      }
      
        return maxsubarray;
    }
}