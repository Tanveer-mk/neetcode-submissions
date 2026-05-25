class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> st = new ArrayDeque<>();
        int[] res = new int[temperatures.length];
        
        for(int i = 0; i < temperatures.length; i++){
            if(st.isEmpty() || temperatures[st.peek()] >= temperatures[i]) st.push(i);
            else{
                while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) res[st.peek()] = i - st.pop();
                 
                st.push(i);
            }
        }

        while(!st.isEmpty()) res[st.pop()] = 0; 

        return res;
    }
}
