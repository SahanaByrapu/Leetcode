class Solution {
    
    static void solve(char[][]board, int n, int col, int []leftrow,
                      int[]lowerdiagonal, int[]upperdiagonal, List<List<String>> result)
    {
        if(col == n)
        {
            List<String> arr=new ArrayList<String>();
            for(int i=0;i<n;i++)
                arr.add(new String(board[i]));
            
            result.add(arr);
            return;
            
        }
        
        for(int row=0;row<n;row++)
        {
            if(leftrow[row]==0 && lowerdiagonal[row+col]==0 &&
               upperdiagonal[n-1+col-row]==0)
            {
                board[row][col]='Q';
                leftrow[row]=1;
                lowerdiagonal[row+col]=1;
                upperdiagonal[n-1+col-row]=1;
                solve(board,n,col+1,leftrow,lowerdiagonal,upperdiagonal,result);
                board[row][col]='.';
                leftrow[row]=0;
                lowerdiagonal[row+col]=0;
                upperdiagonal[n-1+col-row]=0;
            }
                
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
    
        char[][]board=new char[n][n];
        
        for(int row=0;row<n;row++)
            for(int col=0;col<n;col++)
                board[row][col]='.';
        
        int []leftrow=new int[n];
        int []lowerdiagonal=new int[2*n-1];
        int []upperdiagonal =new int[2*n-1];
        List<List<String>> result=new ArrayList<List<String>>();
        solve(board,n,0,leftrow,lowerdiagonal,upperdiagonal,result);
        return result;
        
    }
}