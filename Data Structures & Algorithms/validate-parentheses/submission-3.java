class Solution {
    public boolean isValid(String s) {

        Deque<Character> st = new ArrayDeque<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char ch : s.toCharArray()) {

            // closing bracket
            if (map.containsKey(ch)) {

                if (st.isEmpty() || st.peek() != map.get(ch)) {
                    return false;
                }

                st.pop();
            }

            // opening bracket
            else {
                st.push(ch);
            }
        }

        return st.isEmpty();
    }
}