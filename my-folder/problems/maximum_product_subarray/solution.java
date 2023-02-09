class Solution {
    public int maxProduct(int[] nums) {
    
    int res=nums[0],max_so_far=nums[0],min_so_far=nums[0];
      
    for(int i=1;i<nums.length;i++)
    {
        int curr=nums[i];
        int tmp_max=Math.max(curr,Math.max(curr*max_so_far,curr*min_so_far));
        min_so_far=Math.min(curr,Math.min(curr*max_so_far,curr*min_so_far));

        max_so_far=tmp_max;
        System.out.println(max_so_far);
        res=Math.max(res,max_so_far);
    }

     return res;

    }
}