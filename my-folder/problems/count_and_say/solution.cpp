class Solution {
public:
    string countAndSay(int n) {
       string res="";
        if(n==1) return "1";
        string s= countAndSay(n-1);
        
        for(int i=0;i<s.length();i++){
            int count=1;
            while(s[i]==s[i+1]){
                count++;
                i++;
            }
            res+='0'+count;
            res+= s[i];
        }
        return res;  
    }
};