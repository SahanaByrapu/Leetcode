class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

       int idx=-1;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]<0)
            idx=nums[i]*-1-1;
           else
            idx=nums[i]-1;

           if(nums[idx]>0)
              nums[idx]=-nums[idx];
           
       }

       List<Integer> res= new ArrayList<Integer>();

       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]>0)
             res.add(i+1);
       }

      return res;
    }
}