class Solution {
    public int trap(int[] height) {
        int water = 0;
        int maxLeft = height[0];
        int maxRight = height[height.length-1];
        int l = 1;
        int r= height.length-2;

        while(l <= r){
            if(maxRight < maxLeft){
                if(maxRight - height[r] > 0) water += maxRight - height[r];
                if(height[r] > maxRight) maxRight = height[r];
                r--;
            }else{
                if(maxLeft - height[l] > 0) water += maxLeft - height[l];
                if(height[l] > maxLeft) maxLeft = height[l];
                l++;
            }

            System.out.print(water + " ");
        }

        return water;
    }
}
