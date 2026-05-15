class Solution {
    public int removeDuplicates(int[] nums) {
          
          int k = 0;
          if(nums.length == 1) return 1;

          for(int i = 1; i < nums.length; i++){
               if(nums[i-1] != nums[i]){
                    nums[k] = nums[i-1];
                    k++;
               }
          }

          if(nums[nums.length-1] != nums[k-1]){
               nums[k] = nums[nums.length-1];
               k++;
          }
          
          return k;
    }
}