class Solution {
    
    ArrayDeque<Integer> deq= new  ArrayDeque<Integer>();
    int[] nums;
    public void clean_deque(int i,int k)
    {
        if(!deq.isEmpty() && deq.getFirst() == i-k)
            deq.removeFirst();
        
        while(!deq.isEmpty() && nums[i] > nums[deq.getLast()])
            deq.removeLast();
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        
          int n = nums.length;
          if(n*k == 0) return new int[0];
          if(k==1) return nums;
        
          this.nums=nums;
          int max_indx=0;
          for(int i=0;i<k;i++)
           {
              clean_deque(i,k);
              deq.addLast(i);
              if(nums[i]>nums[max_indx]) max_indx=i;
           }
        
           int[] output= new int[n-k+1];
           output[0]=nums[max_indx];
        
          for(int i=k;i<n;i++)
          {
              clean_deque(i,k);
              deq.addLast(i);
              output[i-k+1]=nums[deq.getFirst()];
          }
        return output;
       
    }
}