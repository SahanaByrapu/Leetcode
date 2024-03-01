class Solution {
    public int addDigits(int num) {
     
        int q,r,sum=0;
        
        while((num/10)>0)
        {
           q=num/10;
           r=num%10;
           sum=q+r;
           num=sum;
        }
        
        return num;
        
        
    }
}