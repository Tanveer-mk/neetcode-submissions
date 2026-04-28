class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        System.out.println(map);

        int[] res = new int[k];
        for(int i = 0; i<k; i++){
            int max = 0;
            int occ = 0;
            for(int j : map.keySet()){
                if(map.get(j) > occ){
                    max = j;
                    occ = map.get(j);
                } 
                    
            }
            res[i] = max;
            map.remove(max);
        }
        return res;
    }
}
