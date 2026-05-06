class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] forward = new int[nums.length];
        int[] backward = new int[nums.length];
        int[] res = new int[nums.length];
        int prod = 1;

        for(int i = 0; i<nums.length; i++){
            prod*=nums[i];
            forward[i] = prod;
        }
        prod = 1; 
        for(int i = nums.length-1; i>=0; i--){
            prod*=nums[i];
            backward[i] = prod;
        }

        res[0] = backward[1];
        res[nums.length-1] = forward[nums.length-2];

        for(int i = 1; i<nums.length-1; i++){
            res[i] = forward[i-1] * backward[i+1];
        }
        
        return res;
        
    }
}  
