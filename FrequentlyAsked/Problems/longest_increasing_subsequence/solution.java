class Solution {
    public int lengthOfLIS(int[] nums) {
        
    /*int [] dp = new int[nums.length+1];
    Arrays.fill(dp,1);

    for (int i=0;i<nums.length;i++)
    {
       for (int j=0;j<i;j++)
       {
           if(nums[i]>nums[j])
           {
            dp[i]=Math.max(dp[i],dp[j]+1);
           }
           
       }
    }

    int longest=0;
    for(int c:dp)
        longest=Math.max(longest,c);

    return longest;*/

    ArrayList<Integer> sub = new ArrayList<Integer>();
    sub.add(nums[0]);
    for(int i=1;i<nums.length;i++)
    {
        if(sub.get(sub.size()-1) < nums[i]) 
         sub.add(nums[i]);
        else
          {
              int j=binarysearch(sub,nums[i]);
              sub.set(j,nums[i]);
          }

    }

    return sub.size();
    }
    private int binarysearch(ArrayList<Integer> sub,int num)
    {
      int low=0;
      int high=sub.size()-1;

    while(low<high)
    {
        int mid=(low+high)/2;
        if(sub.get(mid)==num)
         return mid;
        
        if(sub.get(mid)<num)
          low=mid+1;
        else
          high=mid;
        
    }
      
      return low;

    }

}