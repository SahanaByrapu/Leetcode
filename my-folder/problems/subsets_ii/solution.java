class Solution {
    
    static void  func(int ind,int [] nums,List<Integer> arr, List<List<Integer>> res)
    {
        res.add(new ArrayList<>(arr));
        for(int i=ind;i<nums.length;i++)
        {
            if(i!=ind && nums[i]==nums[i-1]) continue;
            arr.add(nums[i]);
            func(i+1,nums,arr,res);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> arr = new ArrayList<Integer>();
        Arrays.sort(nums);
        func(0,nums,arr,result);
        return result;
    }
}