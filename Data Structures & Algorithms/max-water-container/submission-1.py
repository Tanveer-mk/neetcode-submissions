class Solution:
    def maxArea(self, height: List[int]) -> int:
        i = 0 
        j = len(height) - 1
        sol = 0

        while(i < j):
            if(min(height[j], height[i]) * j-i > sol):
                sol = max(min(height[j], height[i]) * (j-i), sol)
            
            diff = max(height[j], height[i]) - min(height[i], height[j])
            
            # print(i, j, sol)
            
            if(height[i] < height[j]):
                while(height[j] - height[i] >= diff):
                    i += 1
            elif(height[i] > height[j]):
                while(height[i] - height[j] >= diff):
                    j -= 1
            else:
                i += 1
                j -= 1
                
        return sol