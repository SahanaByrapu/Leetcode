class Solution {

    public int removeDuplicates(int[] nums) {
      
        int i,j=0,k;
       
        
        for(i=1;i<nums.length;i++)
        {
            if(nums[i] != nums[j])
                nums[++j]=nums[i];
        }
       
        return j+1;
    }
}