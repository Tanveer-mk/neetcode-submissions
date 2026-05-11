class Solution {
    public String mergeAlternately(String word1, String word2) {
        int k = 0;
        String res = "";
        while(k < word1.length() && k < word2.length()){
            res+=word1.charAt(k);
            res+=word2.charAt(k);
            k++;
        }
        if(word1.length() > k) res+=word1.substring(k, word1.length());
        else if(word2.length() > k) res+=word2.substring(k, word2.length());
        return res;
    }
}