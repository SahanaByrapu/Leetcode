class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashmap={}
        length=len(nums)
        for i in range(length):
            complement=target-nums[i]
            if complement in hashmap:
                return [hashmap[complement],i]
            
            hashmap[nums[i]]= i
            
        