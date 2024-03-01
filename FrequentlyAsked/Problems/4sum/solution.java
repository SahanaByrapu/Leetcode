class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
       List<List<Integer>> result = new ArrayList<List<Integer>>();
        
      int n=nums.length;
      Arrays.sort(nums);
      for(int i=0;i<n;i++)
      {
          int target1=target-nums[i];
        for(int j=i+1;j<n;j++)
        {
            int target2=target1-nums[j];
            int left=j+1;
            int right=n-1;
           
              while(left< right)
              {
               int last_two_sum = nums[left]+nums[right];
               if(last_two_sum < target2)  left++;
               else if(last_two_sum > target2) right--;
               else
               {
                   List<Integer> quad= new ArrayList<Integer>();
                   quad.add(nums[i]);
                   quad.add(nums[j]);
                   quad.add(nums[left]);
                   quad.add(nums[right]);
                   result.add(quad);
                   
                   while(left<right && nums[left] == quad.get(2)) left++;
                   while(left<right && nums[right] == quad.get(3)) right--;
                }
               }
            
             while(j+1 < n && nums[j+1] == nums[j]) ++j;
           }
          
         while(i+1 < n && nums[i+1] == nums[i]) ++i;  
        }
       return result;
    }
}