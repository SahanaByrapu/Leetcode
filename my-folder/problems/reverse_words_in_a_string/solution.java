class Solution {
    public String reverseWords(String s) {
        
   int left=0, right=s.length()-1;
    while(left<=right && s.charAt(left)==' ')  ++left;
    while(left<=right && s.charAt(right)==' ')  --right;  
        
    Deque<String> d = new ArrayDeque();
    StringBuilder word=new StringBuilder();
    while(left<=right)
    {
       char ch=s.charAt(left);
       if(ch!=' ')
        word.append(ch);
       else if((word.length()!=0) && (ch ==' '))
       {
          d.offerFirst(word.toString());
          word.setLength(0);
       }
        
       ++left;
    }
      d.offerFirst(word.toString());
        
     return String.join(" ",d);
   
    }
}