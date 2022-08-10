class Solution {
    
  
    public int romanToInt(String s) {
        
  HashMap<Character,Integer> map =new HashMap<Character,Integer>();
       map.put('M',1000);
       map.put('D',500); 
       map.put('C',100);
       map.put('L',50);
       map.put('X',10);
       map.put('V',5);
       map.put('I',1);
       int i=0,total=0;
      while(i<s.length()) 
       {
           if(i+1 <s.length() && map.get(s.charAt(i))<map.get(s.charAt(i+1)))
           {
              total=total+map.get(s.charAt(i+1))-map.get(s.charAt(i)); 
              i=i+2;
           }
            else
            {
                total+=map.get(s.charAt(i));
                i++;
            }
       }
        
        return total;
    }
}

