class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high - low) / 2;
        int min = nums[mid];
        
        while(low < high){
            if(nums[low] < nums[mid] && nums[mid] < nums[high]) return nums[low];
            else if(nums[low] > nums[mid]) high = mid - 1;
            else low = mid + 1;
            mid = low + (high - low) / 2;
            min = Math.min(min, nums[mid]);
        }

        return min;
    }
}
