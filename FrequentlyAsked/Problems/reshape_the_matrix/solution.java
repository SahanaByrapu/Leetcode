class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
       int m=mat.length;
       int n=mat[0].length;
        
       int [][]reshapemat = new int[r][c];
     
       if(m*n != r*c)
           return  mat;
      
           int i,j,k=0;
           int rows=0,cols=0;
           for(i=0;i<m;i++)
           {
              for(j=0;j<n;j++)
              {
                  reshapemat[rows][cols]=mat[i][j];
                  cols++;
                  if(cols == c)
                  {
                      rows++;
                      cols=0;
                  }
               }
            }
           
           return reshapemat;
    }
}