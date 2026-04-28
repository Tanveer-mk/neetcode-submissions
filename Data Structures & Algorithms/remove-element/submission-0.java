class Solution {
    public int removeElement(int[] nums, int val) {
        int last = 0;
        for (int i = 0; i < nums.length-last; i++) {
            if (nums[i] == val) {
                nums[i] = nums[nums.length-last-1];
                nums[nums.length-last-1] = val;
                last++;
            }
            if(nums[i] == val) i--;
        }
        return nums.length-last;
    }
}