class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        
        nums.sort()
        sol = []
        if(len(nums) < 3):
            return sol
        i = 0
        while(i < len(nums)-1 and nums[i] <= 0):
            j = i+1
            k = len(nums)-1
            while(j<k):
                sums = nums[i] + nums[j] + nums[k]
                if(sums == 0):
                    sol.append([nums[i], nums[j], nums[k]])
                    j += 1
                    k -= 1
                    while(nums[j] == nums[j-1] and j < len(nums)-1):
                        j += 1
                    while(nums[k] == nums[k+1] and k > 1):
                        k -= 1
                elif(sums < 0):
                    j += 1
                else:
                    k -= 1
            
            i += 1
            while(nums[i] == nums[i-1] and i < len(nums)-1):
                i += 1
        
        return sol