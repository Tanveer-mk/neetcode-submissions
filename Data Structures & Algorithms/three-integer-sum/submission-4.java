class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
     //    for(int i : nums){
     //      System.out.print(i + " ");
     //    }
        if(nums[0] > 0) return res;
        int i = 0;
        while(i < nums.length && nums[i] <= 0){
          int l = i+1;
          int r = nums.length-1;
          int diff = 0 - nums[i];
          while(l<r){
               if(nums[l] + nums[r] < diff) l++;
               else if(nums[l] + nums[r] > diff) r--;
               else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    while(l < nums.length && nums[l] == nums[l-1]) l++;
                    r--;
                    while(r >= 0 && nums[r] == nums[r+1]) r--;
               } 
          }
          i++;
          while(i < nums.length && nums[i] == nums[i-1]){
               i++;
          }
        }
        return res;
    }
}
