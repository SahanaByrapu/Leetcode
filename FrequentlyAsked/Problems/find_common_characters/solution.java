class Solution {
    public List<String> commonChars(String[] words) {

     List<String> result=new ArrayList<>();
     
     for(char c='a';c<='z';c++)
     {
         int mincount=Integer.MAX_VALUE;
         for(String w:words)
         {
             int wordcount=0;
             for(char curr: w.toCharArray())
                {if(curr==c) wordcount++;}

              mincount=Math.min(mincount,wordcount);
         }

         for(int i=0;i<mincount;i++) result.add(""+c);
     }

    return result;

    }
}