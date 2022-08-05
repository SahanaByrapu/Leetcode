class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums2.length;i++)
        {
            while(!stk.isEmpty() && stk.peek() < nums2[i])
            {   int x =stk.pop();
                map.put(x,nums2[i]);
             }  
          stk.add(nums2[i]);
        }
        
        while(!stk.empty())
            map.put(stk.pop(),-1);
        
        int [] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
            res[i] = map.get(nums1[i]);
        
        return res;
        
    }
}