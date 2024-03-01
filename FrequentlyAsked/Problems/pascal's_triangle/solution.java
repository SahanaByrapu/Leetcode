class Solution {
    public List<List<Integer>> generate(int r) {
    
      int i,j,sum,count=0;
      List<List<Integer>> pascal=new ArrayList<>();
      List<Integer> row;
      List<Integer> prevrow;
      pascal.add(Arrays.asList(1));
      for(i=1;i<r;i++)
      {
        row=new ArrayList<>();
        prevrow=pascal.get(i-1);
        row.add(1); 
        for(j=1;j<i;j++)
         {
              sum=prevrow.get(j-1)+ prevrow.get(j);
              row.add(sum); 
         }
        row.add(1);
        pascal.add(row);
      }
     return pascal;   
    }
}