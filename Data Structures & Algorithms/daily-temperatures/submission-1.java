class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> st = new ArrayDeque<>();
        
        for(int i = 0; i < temperatures.length; i++){
            if(st.isEmpty() || temperatures[st.peek()] >= temperatures[i]) st.push(i);
            else{
                while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) temperatures[st.peek()] = i - st.pop();
                st.push(i);
            }
        }

        while(!st.isEmpty()) temperatures[st.pop()] = 0; 

        return temperatures;
    }
}
