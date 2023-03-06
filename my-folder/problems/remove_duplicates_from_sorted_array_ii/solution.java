class Solution {
    public int removeDuplicates(int[] nums) {

     if(nums.length==0)
      return 0;

     int i=0;
     for(int n:nums)
     {
         if(i==0 || i==1 || nums[i-2]!=n)
         {
             nums[i]=n;
             i++;
         }
     }

    return i;

    }
}