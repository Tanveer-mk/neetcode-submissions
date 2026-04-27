class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    if(i == 0) return "";
                    return res.substring(0, i);
                }
            }
        }
        return res;
    }
}