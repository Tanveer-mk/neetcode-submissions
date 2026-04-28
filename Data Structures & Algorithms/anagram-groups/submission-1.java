class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            int[] key = new int[26];
            for (char c : ch) {
                key[(int) c - 97] += 1;
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int x : key) {
                list.add(x);
            }
            if (map.containsKey(list)) {
                map.get(list).add(s);
            } else {
                ArrayList<String> sList = new ArrayList<>();
                sList.add(s);
                map.put(list, sList);
            }
        }
        return new ArrayList<>(map.values());
    }
}
