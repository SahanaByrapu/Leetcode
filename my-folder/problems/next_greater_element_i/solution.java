class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

     HashMap<Integer,Integer> hmap=new HashMap<>();

     for(int i=0;i<nums2.length;i++)
      hmap.put(nums2[i],i);

     for(int i=0,k=0;i<nums1.length;i++)
     {
         int index=hmap.get(nums1[i]);
         int max_index=-1;
         for(int j=index+1;j<nums2.length;j++)
         {
           //System.out.println(nums2[index]+" "+nums2[j]);
           if(nums2[j]>nums2[index])
             {
               max_index=j;
               break;
             }
         }

         nums1[i]=(max_index==-1)? -1:nums2[max_index];
     }

     return nums1;

    }
}