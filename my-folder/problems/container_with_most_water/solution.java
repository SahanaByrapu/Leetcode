class Solution {
    public int maxArea(int[] height) {
        
     int low=0;
     int high=height.length-1;
     int maxarea=0;
     while(low<high)   
     {
        int width=high-low;
        int length=Math.min(height[low],height[high]);
        maxarea=Math.max(maxarea,width*length);
        if(height[low]<=height[high])
            low++;
        else
            high--;
     }

    return maxarea;
    }
}