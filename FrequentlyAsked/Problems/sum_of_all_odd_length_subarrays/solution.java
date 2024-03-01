class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int k=(n-i)*(i+1);

            sum+=(k+1)/2*arr[i];
        }

        return sum;
    }
}