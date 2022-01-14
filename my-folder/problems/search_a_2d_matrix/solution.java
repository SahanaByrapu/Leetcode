class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        
        int m =mat.length;
        int n =mat[0].length;
        int pivotelement;
        int low=0,high=m*n-1;
        
                while(low<=high)
                {
                    int mid=(low+high)/2;
                    pivotelement=mat[mid / n][mid % n];
                    
                    if( pivotelement == target)
                        return true;
                    else if(pivotelement <target)
                        low=mid+1;
                    else
                        high=mid-1;
                    
                }
          
        return false;
    }
}