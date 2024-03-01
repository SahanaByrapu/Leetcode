class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder sb = new StringBuilder();
        HashSet<Character> vowel=new HashSet();

        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');

        for(int i=0,j=s.length()-1;i<s.length();i++)
        {
             if(vowel.contains(s.charAt(i)))
             {
                 while(!vowel.contains(s.charAt(j)))
                  j--;
                
                 sb.append(s.charAt(j--));
             }
             else
                sb.append(s.charAt(i));

        }

        return new String(sb);
       
    }
}