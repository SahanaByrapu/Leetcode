class Solution {

    public Boolean doesOverLap(int []current, int []next)
    {
      return Math.min(current[1],next[1])-Math.max(current[0],next[0])>=0;
    }

    public int []mergeIntervals(int []current, int []next)
    {
         int []merged={Math.min(current[0],next[0]),Math.max(current[1],next[1])};
        return merged;
    }
    public int upperbound_bs(int[][] intervals, int []newInterval)
    {
        
        if(intervals.length==0)
          return 0;

        int low=0;
        int high=intervals.length-1;
        int res=intervals.length;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(intervals[mid][0] > newInterval[0])
            {
                 res=mid;
                 high=mid-1;
            }  
            else
            low=mid+1;

        }

        return res;
    }
    public int[][] insertInterval(int[][] intervals, int []newInterval)
    {
         
        List<int[]> result = new ArrayList<>(Arrays.asList(intervals));
        int index=upperbound_bs(intervals, newInterval);

         if(index!=intervals.length)
          result.add(index,newInterval);
         else
         result.add(newInterval);
        
       
       return result.toArray(new int[result.size()][2]);

    }

    public int[][] insert(int[][] intervals, int[] newInterval) {

     
     int[][]interval=insertInterval(intervals,newInterval);
     System.out.println(interval[0][0]);
     List<int []> output =new ArrayList<>();

     for(int i=0;i<interval.length;i++)
     {
        
        int[] current = {interval[i][0], interval[i][1]};

        while(i<interval.length && doesOverLap(current,interval[i]))
          {
            current=mergeIntervals(current,interval[i]);
            i++;
           }

        i--;
        output.add(current);

     }

     return output.toArray(new int[output.size()][2]);
    }
}