class Solution {
    public int numDecodings(String s) {

     if(s.charAt(0)=='0')
       return 0;
     int n=s.length();
     int oneBack=1;
     int twoBack=1;
     
      for(int i=1;i<n;i++)
      {
          int current=0;
          if(s.charAt(i)!='0')
           {current=oneBack;}
          
          int twodigit=Integer.parseInt(s.substring(i-1,i+1));
          if(twodigit>=10 && twodigit<=26)
            {current+=twoBack;}
          
            twoBack=oneBack;
            oneBack=current;
      }   

       return oneBack;


    }
}