class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int low=0,high=n-1;
        int []index=new int[2];
        while(low<=high)
        {
            int sum=nums[low]+nums[high];
                if(sum == target)
                  { 
                    index[0]=low+1;
                    index[1]=high+1;
                    return index;
                  }
                else if(sum<target)
                    low++;
                else
                    high--;
            
        }
      
       index[0]= -1;
       index[1]= -1;
       return index;  
    }
}