class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> res=new ArrayList<Integer>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length)
        {
          if(nums1[i] == nums2[j])
            {
                res.add(nums1[i]);
                i++;
                j++;
            }

          else if(nums1[i]<nums2[j])
              i++;
          else if(nums1[i]>nums2[j])
             j++;
  
        }
        
        System.out.println(res.size());
        
        int ans[]= new int[res.size()];
        int k=0;
        for(int val :res)
        {
            ans[k]=val;
            k++;
        }

        return  ans;
        
    }
}