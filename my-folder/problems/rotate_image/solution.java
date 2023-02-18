class Solution {
    public void rotate(int[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;


        //Transpose
        for(int i=0;i<m;i++)
        {
         for(int j=i+1;j<n;j++)
         {
              int transp=matrix[j][i];
              matrix[j][i]=matrix[i][j];
              matrix[i][j]=transp;

         }
           
        }

        //Reversed
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m/2;j++)
            {
               int temp= matrix[i][j];
               matrix[i][j]= matrix[i][m-j-1];
               matrix[i][m-j-1]=temp;
            }
        }

    }
}