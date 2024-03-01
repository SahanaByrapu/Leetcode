public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

      int rev=0;
      int power=31;

       while(power>=0)
       {
        rev+=(n&1)<<power;
        n=n>>1;
        power--;
       }
      
        return rev;
       
    }
}