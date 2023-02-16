class Solution {

    
    public int minMeetingRooms(int[][] intervals) {

    int n=intervals.length;

    if(n==0)
      return 0;


    //PRIORITYQUEUE
    /*Arrays.sort(intervals,new Comparator<int []>(){
         public int compare(int []a, int []b)
        {
            return a[0]-b[0];
        }
    });


    PriorityQueue<Integer> PQ= new PriorityQueue(n, new Comparator<Integer>(){
         public int compare(Integer a, Integer b)
        {
            return a-b;
        }
    });

    PQ.add(intervals[0][1]);

   for(int i=1;i<n;i++)
   {
       if(intervals[i][0] >= PQ.peek())
         PQ.poll();
    
       PQ.add(intervals[i][1]);
   }


     return PQ.size();*/

     //two-pointers-chronological ordering

     int[]start=new int[n];
     int[]end=new int[n];

     for(int i=0; i<n;i++)
     {
      start[i]=intervals[i][0];
      end[i]=intervals[i][1];
     }

    Arrays.sort(start);
    Arrays.sort(end);

    int i=0, j=0,usedrooms=0;
    while(i<n)
    {
        if(start[i]>=end[j])
        {
            usedrooms--;
            j++;
        }

        i++;
        usedrooms++;

    }

   return usedrooms;

    }
}