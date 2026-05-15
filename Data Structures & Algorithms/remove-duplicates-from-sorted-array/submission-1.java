class Solution {
    public int removeDuplicates(int[] nums) {
          int l = 0;
          int r = 1;
          int k = 0;
          if(nums.length == 1) return 1;
          
          while(l < r && r < nums.length){
               if(nums[l] == nums[r]){
                    l = r;
                    r += 1;
               }else{
                    nums[k] = nums[l];
                    l = r;
                    r += 1;
                    k++;
               }
          }
          if(nums[l] != nums[k-1]){
               nums[k] = nums[l];
               k++;
          }
          return k;
    }
}