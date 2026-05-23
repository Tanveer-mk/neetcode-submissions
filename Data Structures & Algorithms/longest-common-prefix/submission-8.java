class Solution {
    public String longestCommonPrefix(String[] strs) {
        int res = 0;
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            int ct = 0;
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length()-1 < i) return strs[0].substring(0, res);
                if(strs[j].charAt(i) == c) ct++;
            }
            if(ct == strs.length-1) res++;
            else break;
        }
        return strs[0].substring(0, res);
    }
}