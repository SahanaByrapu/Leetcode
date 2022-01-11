class Solution {
    public int maxProfit(int[] prices) {
        
        int minprice=Integer.MAX_VALUE,profit=0;
        for(int l=0;l<prices.length;l++)
        {
              if(prices[l] < minprice)
                  minprice=prices[l];
              else 
                {
                   int diff=prices[l]-minprice;
                   profit=Math.max(profit,diff); 
                }
        }
        
        return profit;
    }
}