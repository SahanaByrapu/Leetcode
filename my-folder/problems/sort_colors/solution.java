class Solution {
    public void sortColors(int[] nums) {
        
    int i,j,k=0,temp;
    i=0;    
    j=nums.length-1;    
    while(i<=j)
    {
        if(nums[i]==0)
        {
            temp=nums[k];
            nums[k++]=nums[i];
            nums[i++]=temp;
        }
        else if(nums[i]==2)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j--]=temp;
        }
        else i++;
    }
        
    
    }
}