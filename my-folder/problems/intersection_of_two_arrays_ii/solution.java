class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       
        int m= nums1.length;
        int n= nums2.length;
        
        int l=0,r=0,k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(l<m && r<n)
        {
            if(nums1[l]==nums2[r]) 
             { 
                  nums1[k++] =nums1[l++];r++;
             } 
            else if(nums1[l]<nums2[r])
            {
                l++;
            }
            else
            {
                r++;
            }
          
        }
        
       return Arrays.copyOfRange(nums1,0,k);    
    }
}