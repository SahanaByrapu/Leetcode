class Solution {
    public int[] buildArray(int[] nums) {

      int q=nums.length;
      for(int i=0;i<nums.length;i++)
      {
         int r=nums[i];
         int b=nums[nums[i]]%q;
         nums[i]=b*q + r;
      } 

      for(int i=0;i<nums.length;i++)
        nums[i]=nums[i] / q;

      return nums;
    }
}