class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if(m*n!=original.length)
           return new int[0][0];

        int[][] res=new int[m][n];
        
        for(int i=0,k=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                 if(k<original.length)
                 res[i][j]=original[k++];
             }
         }

            return res;
    }
}