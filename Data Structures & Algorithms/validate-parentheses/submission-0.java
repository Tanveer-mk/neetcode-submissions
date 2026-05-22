class Solution {
    public boolean isValid(String s) {
        Deque <Character> dq = new ArrayDeque<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(dq.isEmpty()) dq.push(ch);
            else if(dq.peek() == ch-1 || dq.peek() == ch-2) dq.pop();
            else dq.push(ch);
        }
        System.out.println(dq);
        return dq.isEmpty();
    }
}
