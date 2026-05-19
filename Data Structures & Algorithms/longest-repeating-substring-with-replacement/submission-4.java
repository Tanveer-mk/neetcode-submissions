class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int res = 0;
        int maxF = 0;
        HashMap <Character, Integer> map = new HashMap<>();
        
        for(int r = 0; r<s.length(); r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxF = Math.max(maxF, map.get(s.charAt(r)));

            if((r-l+1) - maxF > k){
                while((r-l+1) - maxF > k){
                    map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                    l++;
                }
            }
            System.out.println(map);
            res = Math.max(r-l+1, res);
        }

        return res;
    }
}
