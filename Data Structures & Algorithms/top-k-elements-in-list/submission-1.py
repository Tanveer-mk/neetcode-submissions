class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        n = []
        freq = []
        retList = []
        nums.sort()
        i = 0
        j = i + 1

        while(i < len(nums)):
            while(j < len(nums) and nums[i] == nums[j]):
                j += 1
            
        
            n.append(nums[i])
            freq.append(j-i) 
            i = j

        for i in range(k):
            retList.append(n[freq.index(max(freq))])
            del n[freq.index(max(freq))]
            freq.remove(max(freq))

        return retList