class Solution {

    Map<Integer,Integer> mapcount = new HashMap();
    
    int []unique;
    
    public int[] topKFrequent(int[] nums, int k) {

     if(k==nums.length)
       return nums;
     
     for(int i=0;i<nums.length;i++)
       if(mapcount.get(nums[i])==null)
        mapcount.put(nums[i], 1);
       else
        mapcount.put(nums[i],mapcount.get(nums[i])+1);

     /*
      //PRIORITYQUEUE
     PriorityQueue<Integer> heap= new PriorityQueue<>(
         (a,b)->Integer.compare(mapcount.get(a),mapcount.get(b)));

    for(int num:mapcount.keySet())
    {
        heap.add(num);

        if(heap.size()>k) heap.poll();
    }

    int top[]=new int[k];

    for(int i=0;i<k;i++)
      top[i]=heap.poll();

      return top;*/


    //QUICKSELECT WITH LOMUTO'S PARTITION

    //1.creating unique array.
    
    int i=0;
    int n=mapcount.size();
    unique=new int[n];
     for(int num:mapcount.keySet())
       {
         unique[i]=num;
          i++;
       }

    quickselect(0,n-1,n-k);

    return Arrays.copyOfRange(unique,n-k,n);

    }

    public void quickselect(int left,int right,int kth_smallest)
    {
       if(left==right) return;

       Random random_num= new Random();
       int pivot_index= left + random_num.nextInt(right-left);

       pivot_index=partition(left,right,pivot_index);

       if(kth_smallest==pivot_index)
         return ;
      else if(kth_smallest < pivot_index)
        quickselect(left,pivot_index-1,kth_smallest);
      else
        quickselect(pivot_index+1,right,kth_smallest);

    }

    public int partition(int left,int right,int pivot_index)
    {
      int pivot_freq=mapcount.get(unique[pivot_index]);

      //1.move pivot index to the end
      swap(pivot_index,right);
      int store_index=left;

      for(int i=left;i<=right;i++)
      {
        if(mapcount.get(unique[i])<pivot_freq)
         {swap(store_index,i);
          store_index++;
         }
      }
      
      swap(store_index,right);
      return store_index;
    }

   public void swap(int a,int b)
   {
      int temp=unique[a];
      unique[a]=unique[b];
      unique[b]=temp;
   }
}