class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length,square;
        int left=0, right=n-1;
        int [] result = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            if(Math.abs(nums[left])< Math.abs(nums[right]))
            {
                square=nums[right];
                right--;
                
            }
            else
               {
                   square=nums[left];
                   left++;
               }
              
              result[i]=square*square;
            
        }
        
       return result; 
    }
}