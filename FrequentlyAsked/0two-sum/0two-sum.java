class Solution {
    public int[] twoSum(int[] nums, int target) {
     
     
     HashMap <Integer,Integer> hmap = new HashMap<>();
     
     
     int[]result=new int[2];
        
     for(int i=0;i<nums.length;i++)
     {
         int complement=target-nums[i];
         
         if(hmap.containsKey(complement))
         {
             result[0]=hmap.get(complement);
             result[1]=i;
         }
         
         hmap.put(nums[i],i);
     }

    return result;

     

    }

}