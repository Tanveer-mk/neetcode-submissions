class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != max && count == 0){
                max = nums[i];
                count++;
            }else if(nums[i] == max) count++;
            else count--;
        }
        return max;
    }
}