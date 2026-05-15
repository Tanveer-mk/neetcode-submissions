class Solution {
    public int removeDuplicates(int[] nums) {
          int l = 0;
          int k = 0;
          
          if(nums.length == 1) return 1;

          for(int i = 1; i < nums.length; i++){
               if(nums[l] != nums[i]){
                    nums[k] = nums[l];
                    k++;
               }
               l = i;
          }

          if(nums[l] != nums[k-1]){
               nums[k] = nums[l];
               k++;
          }
          
          return k;
    }
}