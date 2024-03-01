class Solution {
    public String reverseOnlyLetters(String s) {
        
       StringBuilder sb =new StringBuilder();

       for(int i=0,j=s.length()-1;i<s.length();i++)
       {
           if(Character.isLetter(s.charAt(i)))
           {
                while(!Character.isLetter(s.charAt(j)))
                  j--;
                sb.append(s.charAt(j--));
           }
           else
            sb.append(s.charAt(i));
       } 

       return new String(sb);

    }
}