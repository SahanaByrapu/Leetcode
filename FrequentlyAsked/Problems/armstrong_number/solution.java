class Solution {
    public boolean isArmstrong(int n) {
        
       int sum=0,N=n,num=n;
       int k=(int)Math.log10(n)+1;
       k=String.valueOf(n).length();
       while(n>0)
       {
           sum+=Math.pow(n%10,k);
           n=n/10;
           //System.out.print(sum);
       }

       return (sum==num)? true:false;

    }
}