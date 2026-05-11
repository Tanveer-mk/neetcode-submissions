class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        int sum = 0;
        for(int i = 0; i<prefix.length; i++){
            sum+=nums[i];
            prefix[i] = sum;
        }

        int c = 0;
        for(int i = 0; i<prefix.length; i++){
            if(prefix[i] == k) c++;
            for(int j = i+1; j < prefix.length; j++){
                if(prefix[j] - prefix[i] == k) c++;
            }
        }
        
        return c;
    }
}