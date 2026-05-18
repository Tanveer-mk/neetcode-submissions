class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> res = new ArrayList<>();
        
        if(n < 4 ){  
            return res;
        }
        
        int i = 0;
        
        while(i < n-3){
            
            int j = i + 1;
            
            while(j < n - 2){

                int l = j + 1;
                int r = n - 1;

                long diff = (long)target - (nums[i] + nums[j]);
                
                while(l<r){

                    if(nums[l] + nums[r] == diff){
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        
                        l++;
                        while(l < n && nums[l] == nums[l-1]) l++;
                        
                        r--;
                        while(r > 0 && nums[r] == nums[r+1]) r--;

                        j++;
                        while(j < n && nums[j] == nums[j-1]) j++;
                        j--;
                    }else if(nums[l] + nums[r] > diff) r--;
                    else l++;
                }
                j++;
            }
            i++;
            while(i < n && nums[i] == nums[i-1]) i++;
        }
        return res;
    }
}