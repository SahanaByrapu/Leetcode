class Solution {
    public int romanToInt(String s) {

        HashMap<String,Integer> symbols=new HashMap();
        symbols.put("I",1);
        symbols.put("V",5);
        symbols.put("X",10);
        symbols.put("L",50);
        symbols.put("C",100);
        symbols.put("D",500);
        symbols.put("M",1000);

        int i=0,sum=0;

        //LEFT_TO_RIGHT_PASS
        while(i<s.length())
        {
            String current=s.substring(i,i+1);
            int currentVal=symbols.get(current);
            int nextVal=0;
            if(i+1<s.length())
             {
               String next=s.substring(i+1,i+2);
               nextVal=symbols.get(next);
             }
             
            if(currentVal<nextVal)
            {
               sum+=nextVal-currentVal;
               i+=2;
            }
            else
            {
               sum+= currentVal;
               i++; 
            }
        }


        //RIGHT_TO_LEFT_PASS
        
        int last=symbols.get(s.substring(s.length()-1));
        int total=last;
        for(int j=s.length()-2;j>=0;j--)
        {
          int current=symbols.get(s.substring(j,j+1));
          
          if(last>current)
            total-=current;
          else
            total+=current;
          
          last=current;
        }

        //return sum;
        return total;
        
    }
}