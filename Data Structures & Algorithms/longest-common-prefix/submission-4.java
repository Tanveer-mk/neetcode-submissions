class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] res = new char[strs[0].length()];

        for (int i = 0; i < strs[0].length(); i++) {
            char[] s1 = strs[0].toCharArray();
            for (int j = 0; j < strs.length; j++) {
                char[] s2 = strs[j].toCharArray();
                if (i >= s2.length || s2[i] != s1[i]) {
                    String old = new String(res);
                    String ans = old.replace("\0", "");
                    return ans;
                }
            }
            res[i] = s1[i];
        }

        String old = new String(res);
        String ans = old.replace("\0", "");
        return ans;
    }
}