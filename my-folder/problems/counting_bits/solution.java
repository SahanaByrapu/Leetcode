class Solution {
    public int[] countBits(int n) {

        int []ans=new int[n+1];
        for (int i=0;i<=n;i++)
        {
           int bits=0;
           int carry=i;

           while(carry!=0)
           {
               int rem=carry%2;
               carry=carry/2;
               if(rem!=0)
                bits++;
           }
              
          ans[i]=bits;
        }

        return ans;
    }
}