class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
    int i,j,r,c,low,high,mid;
        
    r=matrix.length;
    c=matrix[0].length;
        
     low=0;
     high=r*c-1;
                 while(low<=high)
                 {
                     mid= (low+high)/2;
                     int midelement = matrix[mid/c][mid%c];
                     if( midelement== target)
                         return true;
                     else if(midelement < target)
                         low=mid+1;
                     else
                         high=mid-1;
                 }
        
         return false;
      }
     }