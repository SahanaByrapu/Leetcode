class Solution {

    public void swap(int nums[],int a, int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void permutation(int idx, int[] nums, List<List<Integer>> res )
    {
        
        if(idx==nums.length)
        {
            List<Integer> arr= new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++)
             arr.add(nums[i]);
            res.add(arr);
            return;
        }  
        
        for(int i=idx;i<nums.length;i++)
        {
            swap(nums,i,idx);
            permutation(idx+1,nums,res);
            swap(nums,i,idx);
        }
        

    }
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res=new ArrayList<List<Integer>>();
      
        permutation(0,nums,res);
        return res;
    }
}