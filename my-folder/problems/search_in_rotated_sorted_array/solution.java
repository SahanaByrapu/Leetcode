class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length==1)
         {
            if (nums[0]==target)
            return 0;
            else
            return -1;
         }

        int low=0;
        int high=nums.length-1;
        int mid=0;

        while(low<=high)
        {
            mid=low+high >>1;
            
          if(nums[mid]==target ) return mid;
          if(nums[low]<=nums[mid])
          {
            if(nums[low]<=target && nums[mid]>=target)
              high=mid-1;
            else
             low=mid+1;
          }
          else{
              if(nums[mid]<=target && nums[high]>=target)
              low=mid+1;
              else
              high=mid-1;
              }

        }

        return -1;
    }
}