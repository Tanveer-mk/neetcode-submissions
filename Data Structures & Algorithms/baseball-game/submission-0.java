class Solution {
    public int calPoints(String[] operations) {
        int score = 0;
        Deque <Integer> st = new ArrayDeque<>();

        for(int i = 0; i<operations.length; i++){
            if(operations[i].equals("+")){
                int y = st.pop();
                int x = st.peek();
                st.push(y);
                st.push(x+y);
            }else if(operations[i].equals("D")) st.push(st.peek() * 2);
            else if(operations[i].equals("C")) st.pop();
            else{
                int x = Integer.parseInt(operations[i]);
                st.push(x);
            }
        }
        
        while(!st.isEmpty()){
            score += st.pop();
        }

        return score;

    }
}