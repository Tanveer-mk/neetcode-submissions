class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int res = 0;
        while(r < s.length()){
            if(!set.contains(s.charAt(r))){
                res = Math.max(r-l+1, res);
                set.add(s.charAt(r));
                r++;
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return res;
    }
}
