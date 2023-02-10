public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
      int mask=1;
      int bits=0;
      for(int i=0;i<32;i++)
      {
          if((n&mask)!=0)
              bits++;
          n=n>>1;
      }

      return bits;

    }
}