class Solution {
    public String minWindow(String s, String t) {
        int need = 0;
        int have = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int[] res = new int[2];
        int len = s.length()+1;
        res[0] = -1;

        for(int i = 0; i<t.length(); i++){
            if(!map1.containsKey(t.charAt(i))) need++;
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0) + 1);
        }

        int l = 0;
        for(int r = 0; r<s.length(); r++){
            if(map1.containsKey(s.charAt(r))){
                map2.put(s.charAt(r), map2.getOrDefault(s.charAt(r), 0) + 1);
                if(map1.get(s.charAt(r)) == map2.get(s.charAt(r)))have++;
            }

            if(have == need){
                while(have == need){
                    if(map1.containsKey(s.charAt(l))){
                        map2.put(s.charAt(l), map2.get(s.charAt(l)) - 1);
                        if(map2.get(s.charAt(l)) < map1.get(s.charAt(l))){
                            have--;
                        }
                    }
                    l++;
                }
                if(r-l+2 < len){
                    len = r-l+2;
                    res[0] = l-1;
                    res[1] = r;
                }
            }
        }
        
        return res[0] == -1 ? "" : s.substring(res[0], res[1] + 1);
    }   
}
