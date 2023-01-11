class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        res=0
        flag=0
        sign=1
        n=len(s)
        INT_MIN=pow(-2,31)
        INT_MAX=pow(2,31)-1
        index=0
        
        while (index < n and s[index]==' '):
            index+=1
        
        if(index < n and s[index] == '+'):
            sign=1
            index+=1
            
        elif(index < n and s[index] == '-'):
            sign=-1
            index+=1
            
        while (index < n and s[index].isdigit()):
            
                digit=int(s[index])
                
                if((res  > INT_MAX // 10) or (res == INT_MAX //10 and digit > INT_MAX%10 )):
                    return INT_MAX if (sign==1) else INT_MIN
                
                res= res*10 + digit
                index=index+1
            
        return sign*res   
        