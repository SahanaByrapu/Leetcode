class Solution {
    public int largestRectangleArea(int[] heights) {
        
      int h=heights.length;
      Stack<Integer> stk = new Stack<>();
      int maxArea=0;
      
        
      for(int i=0;i<=h;i++)
      {
          while(!stk.isEmpty() && (i==h || heights[stk.peek()] >= heights[i]))
          {
             int height=heights[stk.peek()];
             stk.pop();
              int width;
              if(stk.isEmpty())
                  width=i;
              else
                  width=i-stk.peek()-1;
              
              maxArea =Math.max(maxArea,width*height);
              
          }  
          stk.add(i);      
              
      }
        
    return maxArea;
        
    }
}