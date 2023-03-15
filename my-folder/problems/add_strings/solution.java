class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder sb = new StringBuilder();
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int carry=0,value=0;
        while(n1>=0 || n2>=0)
        {
            int p =(n1>=0)? num1.charAt(n1)-'0': 0;
            int q =(n2>=0)? num2.charAt(n2)-'0': 0;

            value=(p+q+carry)%10;
            carry=(p+q+carry)/10;
            
            sb.append(value);
            n1--;
            n2--;
        }

        if(carry!=0)
         sb.append(carry);

        return sb.reverse().toString();
          

    }
}