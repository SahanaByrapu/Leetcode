
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        #pre
        """ 
        left=right=0
        res=0
        chars_cnt=Counter()
        
        while right < len(s):
            r=s[right]
            chars_cnt[r]+=1
            
            while chars_cnt[r]>1:
                l=s[left]
                chars_cnt[l]-=1
                left+=1
                
            res=max(res,right-left+1)
            right+=1 """
            
            
        #optimised
        
        i=j=0
        res=0
        dic={}
        for j in range(len(s)):
            if s[j] in dic:
                i=max(dic[s[j]],i)
            res=max(res,j-i+1)
            dic[s[j]]=j+1
        
        return res
        
        
        