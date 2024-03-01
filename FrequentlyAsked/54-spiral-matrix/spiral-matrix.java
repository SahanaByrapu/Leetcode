class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
       int m=matrix.length;
       int n=matrix[0].length;

       List<Integer> res=new ArrayList<Integer>();
       
       int right=n-1,left=0,up=0,down=m-1;
     
       while(res.size()<m*n)
       {
        for(int j=left;j<=right;j++)
         res.add(matrix[up][j]);

        for(int i=up+1;i<=down;i++)
         res.add(matrix[i][right]);
        
        if(up!=down)
        {
          for(int j=right-1;j>=left;j--)
             res.add(matrix[down][j]);
        }
         

        if(left!=right)
        {
          for(int i=down-1;i>up;i--)
            res.add(matrix[i][left]);
        }
        

         left++;
         right--;
         up++;
         down--;
       }
       
        return res;
    }
}