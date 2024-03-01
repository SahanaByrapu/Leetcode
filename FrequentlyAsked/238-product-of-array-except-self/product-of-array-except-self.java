class Solution {
    public int[] productExceptSelf(int[] nums) {   

       int n=nums.length;
       
       
       //Left-Right arrays
       /*int[]left =new int[n];
       int[]right=new int[n];
       
       left[0]=right[n-1]=1;
       for(int i=1;i<n;i++)
        left[i]=left[i-1]*nums[i-1];

       for(int i=n-2;i>=0;i--)
         right[i]=nums[i+1]*right[i+1];

       for(int i=0;i<n;i++)
         nums[i]=left[i]*right[i];*/

       
      //O(1) Space complexity
      int[]answer =new int[n]; 
      answer[0]=1;

      for(int i=1;i<n;i++)      
        answer[i]=answer[i-1]*nums[i-1];

      int R=1;
      for(int i=n-2;i>=0;i--)
      {  
         R*=nums[i+1];
         answer[i]=answer[i]*R;
       }


      return answer;

    }
}