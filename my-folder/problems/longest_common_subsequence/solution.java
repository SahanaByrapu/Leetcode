class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

      int [][]dpGrid = new int[text1.length()+1][text2.length()+1];

      for(int i=text1.length()-1;i>=0;i--)
      {
          for(int j=text2.length()-1;j>=0;j--)
          {
              if(text1.charAt(i)==text2.charAt(j))
               dpGrid[i][j]=1+dpGrid[i+1][j+1];
              else
               dpGrid[i][j]=Math.max(dpGrid[i+1][j],dpGrid[i][j+1]);

          }
      }

     return dpGrid[0][0];
    }
}