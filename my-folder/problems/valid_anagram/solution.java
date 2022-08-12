class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m!=n) return false;
        
        int[]counter =new int[26];
        for(int i=0;i<m;i++)
          counter[s.charAt(i)-'a']++ ;
        for(int j=0;j<n;j++)
        {
            counter[t.charAt(j)-'a']--;
            if(counter[t.charAt(j)-'a'] < 0)
                return false;
        }
        return true;
    }
}