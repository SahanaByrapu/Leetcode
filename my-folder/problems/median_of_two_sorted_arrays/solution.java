class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        int m=nums1.length;
        int n=nums2.length;
        if (m>n)
        {
            return findMedianSortedArrays(nums2,nums1);
        }
        
        int l=0,r=m;
        int total=m+n+1;
        while(l<=r)
        {
            //int fir = l + (r-1)/2 ;
            //int sec = total/2 -fir;
            int fir = l + (r-l)/2;
            int sec = total/2 - fir;
            
            int l1=Integer.MIN_VALUE, l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE, r2=Integer.MAX_VALUE;
            
            /*if(first > 0)
              l1=nums1[first-1];
            if(second > 0)
               l2=nums2[second-1];
            if((first >=0) && (first<m))
                r1=nums1[first];
            if((second >=0) && (second<n))
                r2=nums2[second];
            if(l1<=r2 && l2<=r1)
            {
                if((n+m)%2 == 0)
                    return (Math.max(l1,l2) + Math.min(r1,r2)) /2.0;
                else
                    return Math.max(l1,l2);
            }
            else if(l1 > r2)
                r=first-1;
            else
                l=first+1;*/
            if(fir > 0)
            {
                l1 = nums1[fir-1];
            }
            if(sec>0)
            {
                l2 = nums2[sec-1];
            }
            if((fir>=0) && (fir<m))
            {
                r1 = nums1[fir];
            }
            if((sec>=0) && (sec<n))
            {
                r2 = nums2[sec];
            }
            
            if(l1<=r2 && l2<=r1)
            {
                if((n+m)%2 == 0)
                {
                    return (Math.max(l1, l2)+Math.min(r1, r2))/2.0;
                    
                }
                else
                {
                    return Math.max(l1, l2);
                }
            }
            else if(l1> r2)
            {
                r = fir-1;
            }
            else
            {
                l = fir+1;
            }
        }
        
        return 0;
        
         
    }
}