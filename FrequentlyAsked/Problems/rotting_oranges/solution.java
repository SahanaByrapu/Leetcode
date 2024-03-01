class Solution {
    public int orangesRotting(int[][] grid) {
     
      Queue<Pair<Integer,Integer>> queue = new ArrayDeque();
        
      int fresh=0;
      int r=grid.length, c=grid[0].length;
        
      for(int i=0;i<r;i++)
         for(int j=0;j<c;j++)
          if(grid[i][j]==2)
              queue.offer(new Pair(i,j));
          else if(grid[i][j]==1)
              fresh++;
      
      queue.offer(new Pair(-1,-1));
        
      int minutesElapsed=-1;
      int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};
    
      while(!queue.isEmpty())
      {
          Pair<Integer,Integer> p= queue.poll();
          int row=p.getKey();
          int col=p.getValue();
          if(row==-1)
          {
              minutesElapsed++;
              if(!queue.isEmpty())
                 queue.offer(new Pair(-1,-1));
          }
          else{
              
              for(int[] d:directions)
              {
                  int neighborrow = row+d[0];
                  int neighborcol = col+d[1];
                       
                  if(neighborrow >=0 && neighborrow<r && neighborcol>=0 && neighborcol<c)
                  {
                      if(grid[neighborrow][neighborcol] ==1 )
                      {
                          grid[neighborrow][neighborcol]=2;
                          fresh--;
                          queue.offer(new Pair(neighborrow,neighborcol));
                      }
                  }
              }
          }
      }
        
        return fresh ==0 ? minutesElapsed:-1;
        
    }
}

