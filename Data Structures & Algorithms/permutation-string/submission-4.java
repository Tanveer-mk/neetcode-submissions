class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c = 'a'; c <= 'z'; c++) {
            map1.put(c, 0);
            map2.put(c, 0);
        }

        // initial window
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i),
                    map1.get(s1.charAt(i)) + 1);

            map2.put(s2.charAt(i),
                    map2.get(s2.charAt(i)) + 1);
        }

        int matches = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            if (map1.get(c).equals(map2.get(c))) {
                matches++;
            }
        }

        int l = 0;

        for (int r = s1.length(); r < s2.length(); r++) {

            if (matches == 26)
                return true;

            char leftChar = s2.charAt(l);
            char rightChar = s2.charAt(r);

            // remove left char
            map2.put(leftChar, map2.get(leftChar) - 1);

            if (map2.get(leftChar).equals(map1.get(leftChar))) {
                matches++;
            } else if (map2.get(leftChar) + 1
                    == map1.get(leftChar)) {
                matches--;
            }

            // add right char
            map2.put(rightChar, map2.get(rightChar) + 1);

            if (map2.get(rightChar).equals(map1.get(rightChar))) {
                matches++;
            } else if (map2.get(rightChar) - 1
                    == map1.get(rightChar)) {
                matches--;
            }

            l++;
        }

        return matches == 26;
    }
}