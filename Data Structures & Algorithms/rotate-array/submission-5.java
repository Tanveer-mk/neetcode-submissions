class Solution {

    public void rotate(int[] nums, int k) {
        
        int n = nums.length;

        if(k % n != 0){
            int l = 0, r = n-1;
            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            
            l = 0;
            r = (k-1) % n;
            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }

            l = k % n;
            r = n-1;
            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }
        

    }
}