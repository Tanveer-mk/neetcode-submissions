class Solution {
    public boolean isValid(String s) {
        Deque <Character> dq = new ArrayDeque<>();
        HashMap <Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch) && map.get(ch) == dq.peek()) dq.pop();
            else dq.push(ch);
        }
        return dq.isEmpty();
    }
}
