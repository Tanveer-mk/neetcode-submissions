class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> colors = new HashMap<>();
        
        for(int i: nums){
            colors.put(i, colors.getOrDefault(i, 0) + 1);
        }

        int j = 0;

        for(int i = 0; i<colors.getOrDefault(0, 0); i++){
            nums[j] = 0;
            j++;
        }

        for(int i = 0; i<colors.getOrDefault(1, 0); i++){
            nums[j] = 1;
            j++;
        }

        for(int i = 0; i<colors.getOrDefault(2, 0); i++){
            nums[j] = 2;
            j++;
        }
    }
}