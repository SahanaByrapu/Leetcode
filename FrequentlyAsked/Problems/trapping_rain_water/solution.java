class Solution {
    public int trap(int[] height) {
     
       int left=0,right=height.length-1;
       int leftmax=0,rightmax=0;
        int res=0;
        while(left<right)
        {
            if(height[left] <= height[right])
            {
                if(height[left]>=leftmax)
                    leftmax=height[left];
                
                res+=leftmax-height[left];
                left++;
            }
            else
            {
                if(height[right]>=rightmax)
                    rightmax=height[right];
                res+=rightmax-height[right];
                right--;
            }
        }
        
        return res;
    }
}