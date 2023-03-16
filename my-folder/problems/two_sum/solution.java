class Solution {
    public int[] twoSum(int[] nums, int target) {
     
     
     HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();

     int N=nums.length;
     int [] res= new int[2];
     for(int i=0;i<N;i++)
     {
        int complement = target-nums[i];
        if(hmap.containsKey(complement))
        {
            int j=hmap.get(complement);
            res[0]=i;
            res[1]=j;
            return res;
        }
         
        hmap.put(nums[i],i);

     }

     return res;



     

    }

}