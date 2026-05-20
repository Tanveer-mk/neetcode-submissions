class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int r = 0;
        int l = 0;
        int sum = 0;
        int min = nums.length;
        
        while(r < nums.length){
            sum += nums[r];
            
            while(sum >= target){
                min = Math.min(min, r-l+1);
                sum -= nums[l];
                l++;
            }

            r++;
        }

        if(r - l == nums.length && sum < target) return 0;
        else return min;
    }
}