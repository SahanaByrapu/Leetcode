class Solution {
    public int mySqrt(int x) {
       
        int pivot,left=2,right=x/2;
        long root;
        if(x<2) return x;
        while(left<=right)
        {
            pivot=left+(right-left)/2;
            root=(long)pivot*pivot;
            if(root > x) right=pivot-1;
            else if(root < x) left=pivot+1;
            else return pivot;
        }
      
        return right;
    }
}