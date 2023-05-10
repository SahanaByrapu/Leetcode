class Solution {
    public int totalFruit(int[] fruits) {
        
        
        HashMap<Integer,Integer> basket=new HashMap();
        int i,j;
        /*for(i=0,j=0;i<fruits.length;i++)
        {
           basket.put(fruits[i],basket.getOrDefault(fruits[i],0)+1);

           if(basket.size()>2) 
            {
              basket.put(fruits[j],basket.get(fruits[j])-1);
              if(basket.get(fruits[j])==0)
                basket.remove(fruits[j]);
              j++;
            }

        }*/

       
        
        //sliding window - optimized
        int maxcount=0;
        for(i=0,j=0;i<fruits.length;i++)
        {
           basket.put(fruits[i],basket.getOrDefault(fruits[i],0)+1);

           while(basket.size()>2) 
            {
               basket.put(fruits[j],basket.get(fruits[j])-1);
              if(basket.get(fruits[j])==0)
                basket.remove(fruits[j]);
              j++;
            }

          maxcount=Math.max(maxcount,i-j+1);
        }

        return maxcount;

        //return i-j;
    }
}