class Solution {
    public String minWindow(String s, String t) {
        int need = 0;
        int have = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int[] res = new int[2];
        int len = s.length()+1;

        for(int i = 0; i<t.length(); i++){
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        need = map1.size();

        int l = 0;
        for(int r = 0; r<s.length(); r++){
            char ch = s.charAt(r);
            map2.put(ch, map2.getOrDefault(s.charAt(r), 0) + 1);
            if(map1.containsKey(ch) && map1.get(ch).equals(map2.get(ch))) have++;
            
            while(have == need){
                char lch = s.charAt(l);
                if(r-l+1 < len){
                    len = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }
                
                map2.put(lch, map2.get(lch) - 1);
                
                if(map1.containsKey(lch) && map2.get(lch) < map1.get(lch)) have--;
                
                l++;
            }
            
        }
        
        return len == s.length() + 1 ? "" : s.substring(res[0], res[1] + 1);
    }   
}
