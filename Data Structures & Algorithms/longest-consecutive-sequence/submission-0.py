class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if(len(nums) < 1):
            return 0
        elif(len(nums) < 2):
            return 1

        nums.sort()
        i = 0
        j = i+1
        temp = 1
        cs = 0
        while(i < len(nums)-1):
            if(nums[j]-1 == nums[i]):
                temp += 1
                i += 1
                j += 1
            elif(nums[j] == nums[i]):
                i += 1
                j += 1
                continue
            else:
                cs = max(temp, cs)
                temp = 1
                i += 1
                j += 1
        return max(temp, cs)