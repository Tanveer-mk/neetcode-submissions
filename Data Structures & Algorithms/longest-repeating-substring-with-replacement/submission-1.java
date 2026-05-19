class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int res = 0;
        int max = 0;
        HashMap <Character, Integer> map = new HashMap<>();

        while(r < s.length()){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            max = Math.max(map.get(s.charAt(r)), max);

            boolean isValid = (r-l+1) - max <= k; 
            
            if(isValid){
                res = Math.max(r-l+1, res);
                r++;
            }else{
                map.put(s.charAt(r), map.get(s.charAt(r))-1);
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                max = Math.max(map.get(s.charAt(r)), max);
                l++;
            }
            System.out.println(map);
        }
        return res;
    }
}
