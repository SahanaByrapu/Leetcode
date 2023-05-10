class Solution {
    public int totalFruit(int[] fruits) {
        
        int sliding_window=0;
        HashMap<Integer,Integer> basket=new HashMap();
        int i,j;
        for(i=0,j=0;i<fruits.length;i++)
        {
           basket.put(fruits[i],basket.getOrDefault(fruits[i],0)+1);

           if(basket.size()>2) 
            {
              basket.put(fruits[j],basket.get(fruits[j])-1);
              if(basket.get(fruits[j])==0)
                basket.remove(fruits[j]);
              j++;
            }

        }

        return i-j;
    }
}