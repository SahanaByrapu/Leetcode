class Solution {
    
    static void func(int indx, int[] candidates, int target, List<Integer> arr,          List<List<Integer>> result) 
    {
        if(target==0) {
            result.add(new ArrayList<Integer>(arr));
            return;
        }
        for(int i=indx;i<candidates.length;i++)
        {
            if(i>indx && candidates[i]==candidates[i-1]) continue;
            if(candidates[i] > target) break;
            arr.add(candidates[i]);
            func(i+1, candidates,target-candidates[i],arr,result);
            arr.remove(arr.size()-1);
        }
        
        
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       
       List<List<Integer>> result = new  ArrayList<List<Integer>>();
       List<Integer> arr = new ArrayList<Integer>();
       Arrays.sort(candidates);
       func(0, candidates,target,arr,result);
        
       return result;
    }
}