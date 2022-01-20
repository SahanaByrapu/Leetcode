class Solution {
    public int climbStairs(int n) {
   
        int [] mem = new int[n+1];
        return climbStairsup(0,n,mem);
        
    }
    
   public int climbStairsup(int i,int n,int[]mem) { 
    if(i>n)
            return 0;
        else if(i==n)
            return 1;
        else if(mem[i]>0)
            return mem[i];
        else
        {
           mem[i]= climbStairsup(i+1,n,mem)+climbStairsup(i+2,n,mem); 
        }
      
      return mem[i]; 
   }
}