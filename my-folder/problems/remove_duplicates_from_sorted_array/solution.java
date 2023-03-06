class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0)
         return 0;

        int AddIndex=1;
        for(int i=0;i< nums.length-1;i++)
        {
            if(nums[i] < nums[i+1])
            {
              nums[AddIndex]=nums[i+1];
              AddIndex++;
            }

        }

        return AddIndex;
        
    }
}