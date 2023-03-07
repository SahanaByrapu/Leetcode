class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

      HashSet<Integer> set1= new HashSet();
      for(int i=0;i<nums1.length;i++)
        set1.add(nums1[i]);
    
      HashSet<Integer> result= new HashSet();
      for(int n:nums2)
      {
          if(set1.contains(n))
            result.add(n);
      }

      int[]answer=new int[result.size()];
       int i=0;
      for(int val:result)
       {
           answer[i]=val;
           i++;
       }

      return answer;

    }
}