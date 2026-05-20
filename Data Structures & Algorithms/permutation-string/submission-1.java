class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i),
                    map1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int l = 0;

        for (int r = 0; r < s2.length(); r++) {

            map2.put(s2.charAt(r),
                    map2.getOrDefault(s2.charAt(r), 0) + 1);

            // 🔥 CHANGED:
            // maintain fixed window size
            if (r - l + 1 > s1.length()) {

                map2.put(s2.charAt(l),
                        map2.get(s2.charAt(l)) - 1);

                if (map2.get(s2.charAt(l)) == 0)
                    map2.remove(s2.charAt(l));

                l++;
            }

            // 🔥 CHANGED:
            // compare only when window size matches
            if ((r - l + 1) == s1.length()
                    && map1.equals(map2)) {

                return true;
            }
        }

        return false;
    }
}