class Solution {
    public int maxProfit(int[] prices) {
        
    int i,j;
    int minprice=Integer.MAX_VALUE,diff=0,profit=0;
        
     for(i=0;i<prices.length;i++)
     {
         if(prices[i] < minprice)
             minprice=prices[i];
        else if( prices[i] - minprice > profit)
           profit= prices[i] - minprice;
     }
        
     return profit;
    }
}