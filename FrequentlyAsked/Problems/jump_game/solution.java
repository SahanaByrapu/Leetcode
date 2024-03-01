enum Index{
    GOOD,BAD,UNKOWN
}

class Solution {
    Index[] memo;

     public boolean canJump(int[] nums) {
      int n=nums.length;
      memo=new Index[nums.length];
      for(int i=0;i<n;i++)
       memo[i]=Index.UNKOWN;
      
      memo[n-1]=Index.GOOD;

      //BOTTOM_UP
      for(int i=n-2;i>=0;i--)
      {
        int furthest= Math.min(i+nums[i],n-1);
        for(int j=i+1;j<=furthest;j++)
        {
            if(memo[j]==Index.GOOD)
            {
                memo[i]=Index.GOOD;
                break;
            }
        }
      }


    //GREEDY

      int lastPos=n-1;

      for (int i=n-1;i>=0;i--)
      {
          if(i+nums[i] >=lastPos)
           lastPos=i;
      }

      return lastPos==0;
      //return memo[0]==Index.GOOD? true:false;

      
      //return canJumpFromPosition(0,nums);
    }


    //TOP_DOWN
    public boolean canJumpFromPosition(int position, int []nums)
    {
     
       if(memo[position]!=Index.UNKOWN)
           return memo[position]==Index.GOOD? true:false;

       int furthest= Math.min(position+nums[position],nums.length-1);
       
       for(int next=position+1;next<=furthest;next++)
       {
           if(canJumpFromPosition(next,nums))
              {
                  memo[next]=Index.GOOD;
                  return true;
              }
              
       }
       
       memo[position]=Index.BAD;
       return false;
    }
   
}