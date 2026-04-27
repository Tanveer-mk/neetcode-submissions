class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        book = {}
        for i, v in enumerate(nums):
            diff = target - v
            if(diff in book):
                return [book[diff], i]
            else:
                book[v] = i