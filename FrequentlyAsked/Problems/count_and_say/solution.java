class Solution {
    public String countAndSay(int n) {
     String res="";
        if(n==1) return "1";
        String s= countAndSay(n-1);
        
        for(int i=0;i<s.length();i++){
            int count=1;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            res+=count;
            res+= s.charAt(i);
        }
        return res;  
        
    }
}