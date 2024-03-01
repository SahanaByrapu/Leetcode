class Solution {
    public int maxArea(int[] heights) {
        
     
        int low=0;
        int high=heights.length-1;
        int area=0;
        
        while(low<high)
        {
          int width= high-low;
          int height= Math.min(heights[low],heights[high]);   
          area= Math.max(area,width*height);
        
          if(heights[low]<=heights[high])
              low++;
          else
              high--;
        }
        
        return area;
    }
}