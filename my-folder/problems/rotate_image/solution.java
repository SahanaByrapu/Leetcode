class Solution {
    public void rotate(int[][] matrix) {
        
     int i,j,r,c,k,temp;
     r=matrix.length;
        
     for(i=0;i<(r+1)/2;i++)
     {
         for(j=0;j<r/2;j++)
         {
               temp=matrix[r-1-j][i];
               matrix[r-1-j][i]=matrix[r-1-i][r-j-1];
               matrix[r-1-i][r-j-1]=matrix[j][r-1-i];
               matrix[j][r-1-i]=matrix[i][j];
               matrix[i][j]=temp;
         }
     }
        
        
    }
}