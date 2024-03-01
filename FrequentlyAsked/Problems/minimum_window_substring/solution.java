class Solution {
    public String minWindow(String s, String t) {


       if(s.length()==0 || t.length()==0)
         return "";

       Map<Character,Integer> dicT= new HashMap();
       for(int i=0;i<t.length();i++)
       {
           int count=dicT.getOrDefault(t.charAt(i),0);
           dicT.put(t.charAt(i),count+1);
       }

       int left=0,right=0;
       int required=dicT.size();
       int formed=0;

       Map<Character,Integer> windowcounts= new HashMap<Character,Integer>();

      int [] ans={-1,0,0};

        while(right<s.length())
        {
            Character c=s.charAt(right);
            int count=windowcounts.getOrDefault(c,0);
            windowcounts.put(c,count+1);

            if(dicT.containsKey(c) && 
            windowcounts.get(c).intValue() ==  dicT.get(c).intValue())
             formed++;
            
            while(left<=right && formed==required)
            {
               c= s.charAt(left);
               if(ans[0]==-1 || right-left+1 < ans[0] )
               {
                   ans[0]=right-left+1;
                   ans[1]=left;
                   ans[2]=right;
               }

               windowcounts.put(c,windowcounts.get(c)-1);
                if(dicT.containsKey(c) && 
              windowcounts.get(c).intValue()< dicT.get(c).intValue())
                formed--;

                left++;

            }
             right++;
             

        }

        return (ans[0]==-1)? "": s.substring(ans[1],ans[2]+1);

    }
}