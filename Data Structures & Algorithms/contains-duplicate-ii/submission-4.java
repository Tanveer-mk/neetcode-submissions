class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        int r = 0;
        while(r < k){
            if(set.contains(nums[r])) return true;
            else set.add(nums[r]);
            r++;
        } 


        while(r < nums.length){
            if(set.contains(nums[r])) return true;
            else{
                set.remove(nums[l]);
                set.add(nums[r]);
                l++;
                r++;
            }
        }
        return false;
    }
}