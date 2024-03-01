class Solution {
    public void rotate(int[][] matrix) {
        
       int m=matrix.length;
       int n=matrix[0].length;

       //transpose
       for(int i=0;i<m;i++)
       {
         for(int j=i+1;j<n;j++)
         {
             int temp=matrix[i][j];
             matrix[i][j]=matrix[j][i];
             matrix[j][i]=temp;
         }

       } 

       //reverse
       for(int i=0;i<m;i++)
       {
        for(int j=0,k=n-1;j<k;j++,k--)
        {
         int temp=matrix[i][j];
         matrix[i][j]=matrix[i][k];
         matrix[i][k]=temp;
        }
         
       }

      
       return ;

    }
}