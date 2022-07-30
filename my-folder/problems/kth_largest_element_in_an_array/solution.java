class Solution {
    
    static int partition(int []nums,int left,int right)
    {
        int pivot=nums[left];
        int l=left+1;
        int r=right;
        while(l<=r)
        {
          if(nums[l] < pivot && nums[r] > pivot)
          {
              int temp=nums[l];
              nums[l]=nums[r];
              nums[r]=temp;
              l++;
              r--;
          }
            
          if(nums[l]>=pivot) l++;
            
          if(nums[r]<=pivot) r--;
        } 
        
        int temp=nums[left];
        nums[left]=nums[r];
        nums[r]=temp;
        
        return r;
        
    }
    
    public int findKthLargest(int[] nums, int k) {
        
        int n=nums.length;
        int left=0;
        int right=n-1;
        
        while(true)
        {
            int index=partition(nums,left,right);
            if(index == k-1)
                return nums[index];
            if(index < k-1)
                left=index+1;
            else
                right=index-1;
        }
       
        
    }
}