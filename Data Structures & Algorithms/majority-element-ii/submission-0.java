class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int freq = nums.length / 3;
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList <Integer> res = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > freq) res.add(key);
        }
        return res;
    }
}