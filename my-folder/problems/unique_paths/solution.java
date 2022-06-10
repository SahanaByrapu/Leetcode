class Solution {
    public int uniquePaths(int m, int n) {
        
    int N= m+n-2;
    int r= m-1;
    int i;
    double res=1;
            
            for ( i = 1; i <= r; i++)
                res = res * (N - r + i) / i;
            return (int)res;
       
    }
}