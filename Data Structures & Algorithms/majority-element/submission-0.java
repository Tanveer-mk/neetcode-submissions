class Solution {
    public int majorityElement(int[] nums) {
        int threshold = nums.length/2;
        HashMap <Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = nums.length-1;
        
        while(i<=j){
            if(i == j){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
                i++;
            }else{
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
                map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
                i++;
                j--;
            }
        }

        System.out.println(map);

        for(int it : map.keySet()){
            if(map.get(it) > threshold)
                return it;
        }
        return 0;

    }
}