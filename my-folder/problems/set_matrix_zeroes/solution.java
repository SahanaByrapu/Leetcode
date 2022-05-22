class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m,n,i,j;
        Boolean isCol=false;
        m=matrix.length;
        n=matrix[0].length;
        
        for(i=0;i<m;i++)
        {
            if(matrix[i][0]==0)
                isCol=true;
            
            for(j=1;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(i=1;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                if(matrix[i][0]== 0 || matrix[0][j] == 0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
       if(matrix[0][0]==0)
       {
           for(j=0;j<n;j++)
               matrix[0][j]=0;
       }
        
      if(isCol)
      {
          for(i=0;i<m;i++)
              matrix[i][0]=0;
      }
    }
}