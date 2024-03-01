class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> res= new ArrayList<Integer>();

        for(int i=0;i<=nums.length-1;i++)
        {
          int index=Math.abs(nums[i])-1;
          if(nums[index]>0)
           nums[index]*=-1;
          else
           res.add(Math.abs(nums[i]));
        }

     return res;

    }
}