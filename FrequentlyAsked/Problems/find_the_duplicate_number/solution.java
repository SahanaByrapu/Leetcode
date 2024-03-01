class Solution {
    public int findDuplicate(int[] nums) {
    
    /*int duplicate=-1;
    for (int i=0;i<nums.length;i++)
     {
        int cur= Math.abs(nums[i]);
         if(nums[cur] < 0)
         {
             duplicate=cur;
             break; 
         }
         nums[cur]*=-1;
     }
       
    
     for(int i=0;i<nums.length;i++)
         nums[i]=Math.abs(nums[i]);
        
    return duplicate;*/
        
       int slow=nums[0];
       int fast=nums[0];
       
       do{
          slow=nums[slow];
          fast=nums[nums[fast]];
           
        }while(slow!=fast);
        
        slow=nums[0];
            
        while(fast!=slow)
        {
           slow=nums[slow]; 
           fast=nums[fast];
        }
        
        return fast;
    }
}