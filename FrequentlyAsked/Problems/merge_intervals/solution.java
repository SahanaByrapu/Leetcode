class Solution {

   
    public int[][] merge(int[][] intervals) {
        

        int n=intervals.length;
        LinkedList<int[]> merged = new LinkedList<>();

        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        
        for(int i=0;i<n;i++)
        {
            if(merged.isEmpty() || merged.getLast()[1] < intervals[i][0])
              merged.add(intervals[i]);
            else
              merged.getLast()[1]=Math.max(intervals[i][1],merged.getLast()[1]);

        }

        return merged.toArray(new int[merged.size()][2]);

    }
}