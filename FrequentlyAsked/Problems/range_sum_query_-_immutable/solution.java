class NumArray {

    int[]prefixsum;
    public NumArray(int[] nums) {

       prefixsum=new int[nums.length];
       for(int i=0;i<nums.length;i++ )
       {
           prefixsum[i]=nums[i];
           if(i>0) prefixsum[i]+=prefixsum[i-1];
       }

    }
    
    public int sumRange(int left, int right) {
        
          return  prefixsum[right]-((left>0)? prefixsum[left-1]:0);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */