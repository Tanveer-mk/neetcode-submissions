class Solution {
    public int min(int a, int b){
        if(a < b) return a;
        else return b;
    }

    public int maxArea(int[] heights) {
        
        int max = -1;

        int l = 0;
        int r = heights.length-1;

        while(l < r){
            int water = (r-l) * min(heights[l], heights[r]);
            max = max > water ? max : water;
            
            if(heights[l] < heights[r]) l++;
            else r--;
        }

        return max;
    }
}
