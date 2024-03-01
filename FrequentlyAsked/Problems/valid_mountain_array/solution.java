class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int max= Integer.MIN_VALUE;
        int index_max=0,x=0;

        boolean b=true;
        for(int i:arr) max=Math.max(max,i);
        while(max!=arr[x++]) index_max++;

        if(arr.length<3 || index_max==arr.length-1 || index_max==0) return false;

        for(int i=0;i<index_max;i++)
          if(!(arr[i]<arr[i+1])) return false;
        
        for(int i=index_max;i<arr.length-1;i++)
           if(arr[i]<=arr[i+1]) return false;

        return b;
    }
}