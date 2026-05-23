class MinStack {
    Deque <Integer> st;
    Deque <Integer> min;
    public MinStack() {
        st = new ArrayDeque<>();
        min = new ArrayDeque<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty() || val <= min.peek()) min.push(val);
    }
    
    public void pop() {
        int p = st.pop();
        if(min.peek() == p) min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
