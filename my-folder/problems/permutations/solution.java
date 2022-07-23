class Solution {
    static void swap(int [] nums, int j, int k) 
    {
        int temp=nums[j];
        nums[j]=nums[k];
        nums[k]=temp;
    }
    
   static void func(int indx, int [] nums,  List<List<Integer>> result)
    {
       if(indx==nums.length)
        {
            List<Integer> arr = new ArrayList<Integer>();
            for(int j=0;j<nums.length;j++)
                arr.add(nums[j]);
            result.add(new ArrayList<>(arr));
            return;
        }
        
        for(int i=indx;i<nums.length;i++)
        {
            swap(nums,i,indx);
            func(indx+1,nums,result);
            swap(nums,i,indx);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        func(0,nums,result);
        return result;
    }
}