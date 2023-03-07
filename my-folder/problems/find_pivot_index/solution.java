class Solution {
    public int pivotIndex(int[] nums) {

       int sum=0,temp=0;
       for(int i=0;i<=nums.length-1;i++) 
         sum+=nums[i];

       for(int i=0;i<=nums.length-1;i++) 
       {
           sum-=nums[i];
           if(sum==temp) return i;
           temp+=nums[i];
          
       }

       return -1;

    }
}