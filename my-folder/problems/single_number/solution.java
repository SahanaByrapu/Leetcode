class Solution {
    public int singleNumber(int[] nums) {
   
        /*Arrays.sort(nums);
        int i;
        
        for(i=0;i<nums.length-1;i+=2)
        {
            if(nums[i]!=nums[i+1])
                return nums[i];
        }
        
        return nums[i];*/
        int a=0;
        for(int i :nums)
            a=a^i;
        
        return a;
        
    }
}