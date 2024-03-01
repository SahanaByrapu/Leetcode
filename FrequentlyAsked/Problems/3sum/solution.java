class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      
      List<List<Integer>> res= new ArrayList<List<Integer>>();

      int n=nums.length;

    Arrays.sort(nums);
    for(int i=0;i<n;i++)
    {
       if(i==0 || (i>0 && nums[i]!=nums[i-1]))
       {
        int a=nums[i],low=i+1,high=n-1;
        while(low<high)
        {
          if(nums[low]+nums[high]==-a)
          {
              res.add(Arrays.asList(nums[i],nums[low],nums[high]));
              while(low<high && nums[low]==nums[low+1]) low++;
              while(low<high && nums[high]==nums[high-1]) high--;

              low++; high--;

          }
          else if(nums[low]+nums[high]<(-a))
            low++;
          else
            high--;

        }
       }
    }

    return res;
      
        
    }
}