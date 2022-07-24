class Solution {
    
    static boolean isValid(char[][] board,int row,int col,int num,int n)
    {
          
        for(int i=0;i<9;i++)
        {
           if(board[i][col]==num)
               return false;
            if(board[row][i]==num)
               return false;
            if(board[3*(row/3) + i/3][3*(col/3)+i%3]==num)
               return false;        
        }
        
        return true;
    }
    
    static boolean solve(char[][] board,int n)
    { 
        for(int i=0;i<9;i++)
        {
           for(int j=0;j<9;j++)
           {
              if(board[i][j]=='.')
               {
                  for(char k='1';k<='9';k++)
                  {
                     if(isValid(board,i,j,k,n))
                     { 
                         board[i][j]=k;
                         if(solve(board,n))
                           return true;
                         else
                           board[i][j]='.';  
                       
                      } 
                   }
                  return false;
                }
            }
          
         }
        
        return true;
     }
    
    public void solveSudoku(char[][] board) {
     
        int n=9;
        solve(board,n);
        
    }
}