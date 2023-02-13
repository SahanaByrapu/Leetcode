class Solution {

    public void DFS(char [][] grid, int r,int c)
    {
        int nr=grid.length;
        int nc=grid[0].length;

        if(r<0 || c<0 || r>=nr || c>=nc || grid[r][c]=='0')
            return;

        grid[r][c]='0';
        DFS(grid,r-1,c);
        DFS(grid,r+1,c);
        DFS(grid,r,c-1);
        DFS(grid,r,c+1);

    }
    public int numIslands(char[][] grid) {
        
     int r=grid.length;
     int c=grid[0].length;
     int numislands=0;
     for(int i=0;i<r;i++)  
     {
         for(int j=0;j<c;j++)
         {
             if(grid[i][j]=='1')
             {
                 numislands++;
                 DFS(grid,i,j);
             }
         }
     } 
    return numislands;
    
    }
}