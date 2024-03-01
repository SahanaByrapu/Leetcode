class Solution {
    
    static void func(int indx, int[] candidates,int target, List<Integer> arr,List<List<Integer>> result)
    {
        if(indx == candidates.length)
        {
            if(target==0)
            {
                result.add(new ArrayList<Integer>(arr));
            }
            return;
        }
        
        if(candidates[indx] <= target)
        {
             arr.add(candidates[indx]);
             func(indx,candidates,target-candidates[indx],arr,result);
             arr.remove(arr.size()-1);
        }
       
        func(indx+1,candidates,target,arr,result);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> arr= new ArrayList<Integer>();
        func(0,candidates,target,arr,result);
        return result;
    }
}