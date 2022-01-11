class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        int l=0,r=0,p=0;
        int [] nums1copy=new int[m];
        
        for(int i=0;i<m;i++)
            nums1copy[i]=nums1[i];
            
        while(p<m+n)
        {
            if(r>=n || (l<m && nums1copy[l]<nums2[r]))
            {
               nums1[p]=nums1copy[l];
                l++;
                p++;
            }
            else
            {
                nums1[p]=nums2[r];
                r++;
                p++;
            }
        }
        
        
    }
}