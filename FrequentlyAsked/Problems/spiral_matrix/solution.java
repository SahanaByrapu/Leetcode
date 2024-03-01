class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res=new ArrayList();
        int m=matrix.length;
        int n=matrix[0].length;
        int up=0,down=m-1,right=n-1,left=0;


      while(res.size()!=m*n)
      {
            
        for(int col=left;col<=right;col++)
           res.add(matrix[up][col]);
        
        for(int row=up+1;row<=down;row++)
            res.add(matrix[row][right]);

        if(up!=down)
        for(int col=right-1;col>=left;col--)
            res.add(matrix[down][col]);

        if(left!=right)
        for(int row=down-1;row> up;row--)
          res.add(matrix[row][left]);
        
        left++;
        right--;
        up++;
        down--;
      }

      return res;
    }
}