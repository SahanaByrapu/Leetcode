class Solution {

    public class myComparator implements Comparator<int[]>
    {
         public int compare(int [] a, int [] b )
         {
             return a[1]-b[1];
         }
    }

    public boolean isOverLapping(int []i, int []j)
    {
        return i[1] > j[0];
    }
   
    public int eraseOverlapIntervals(int[][] intervals) {
        
        if(intervals.length==0)
          return 0;

        Arrays.sort(intervals,new myComparator());
        /*int []dp = new int[intervals.length];
        dp[0]=1;
        int ans=1; 
        
        for (int i=1; i<dp.length;i++)
        {
            int maxval=0;
            for(int j=i-1;j>=0;j--)
            {
                if(!isOverLapping(intervals[j],intervals[i]))
                {
                  maxval=Math.max(dp[j],maxval);
                  break;
                }

            }

            dp[i]=Math.max(dp[i-1],maxval+1);
            ans=Math.max(ans,dp[i]);
        }

        return intervals.length-ans;*/


        //GREEDY APPROACH
        int prev=0;
        int count=0;
        for(int i=1;i<intervals.length;i++)
        {
            
            if(intervals[prev][1] > intervals[i][0])
            {
                if(intervals[prev][0] > intervals[i][1])
                {
                     prev=i;     
                }
                
                count++;  
            }

            else
             prev=i;
        }

        return count;
    }
}