class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int res = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == res){
                count++;
            }else if(nums[i] != res && count > 0){
                count--;
            }else{
                count++;
                res = nums[i];
            }
        }

        return res;
    }
}