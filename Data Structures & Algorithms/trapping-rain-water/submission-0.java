class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];
        int water = 0;
        
        for(int i = 0; i<n; i++){
            if(i == 0) maxLeft[i] = 0;
            else{
                maxLeft[i] = maxLeft[i-1] > height[i-1] ? maxLeft[i-1] : height[i-1];
            }
        }

        for(int i = n-1; i>=0; i--){
            if(i == n-1) maxRight[i] = 0;
            else{
                maxRight[i] = maxRight[i+1] > height[i+1] ? maxRight[i+1] : height[i+1];
            }
        }

        for(int i = 0; i<n; i++){
            int min = Math.min(maxRight[i], maxLeft[i]);
            if(min - height[i] > 0) water += min - height[i]; 
        }

        return water;
    }
}
