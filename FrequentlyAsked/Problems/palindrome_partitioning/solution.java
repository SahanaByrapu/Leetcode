class Solution {
    
    static void func(int indx, String s, List<String> res, List<List<String>> result)
    {
        if(indx==s.length() )
        {
            result.add(new ArrayList<String>(res));
            return;
        }
        
        for(int i=indx;i<s.length();++i)
        {
              if(isPalindrome(s,indx,i))
             {
                res.add(s.substring(indx,i+1));
                func(i+1,s,res,result);
                res.remove(res.size()-1);
              }
        }
    }
    
    static boolean isPalindrome(String s, int indx, int i)
    {
        while(indx<=i)
        {
          if(s.charAt(indx++)!=s.charAt(i--))
             return false;
        }
        
        return true;
    }
    
    public List<List<String>> partition(String s) {
        
        List<List<String>> result= new ArrayList<List<String>>();
        List<String> res = new ArrayList<String>();
        func(0,s,res,result);
        
        return result;
    }
}