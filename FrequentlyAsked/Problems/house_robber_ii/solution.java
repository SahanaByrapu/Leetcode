class Solution {
    public int rob(int[] nums) {
        
    int N=nums.length;

    
    
     if(N==1) return nums[0];

    int max1=robb(nums,0,N-2);
    int max2=robb(nums,1,N-1);

     return Math.max(max1,max2);
    }

    private int robb(int []nums,int start,int end)
    {
        int t1=0,t2=0,temp=0,current;

        while(start<=end)
        {
           temp=t1;
           current=nums[start];
           t1=Math.max(current+t2,t1);
           t2=temp;
           start++;
        }

        return t1;
    }
}