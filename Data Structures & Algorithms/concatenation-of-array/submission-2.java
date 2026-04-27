class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<2; i++){
            for(int j = 0; j<n; j++){
                ans.add(nums[j]);
            }
        }
        int[] res = ans.stream().mapToInt(i -> i).toArray();
        return res;
    }
}