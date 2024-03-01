class Solution {
    public String getPermutation(int n, int k) {
        
     ArrayList<Integer> nums = new ArrayList<Integer>();
     int fact=1;   
     for(int i=1;i<n;i++) 
     {
         fact=fact*i;
         nums.add(i);
     }
     nums.add(n);
     k=k-1;   
     String res = "";  
        
     while(true)
     {
        res+=nums.get(k/fact);
        nums.remove(k/fact);
        if(nums.size()==0)
            break;
        k=k%fact;
        fact=fact/nums.size();
     }
    
        
       
      return res; 
    }
}