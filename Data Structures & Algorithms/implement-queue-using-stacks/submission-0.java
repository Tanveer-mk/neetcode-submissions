class MyQueue {
    Deque <Integer> st;
    Deque <Integer> aux;

    public MyQueue() {
        st = new ArrayDeque <>();
        aux = new ArrayDeque <>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(!st.isEmpty()){
            aux.push(st.pop());
        }
        int p = aux.pop();

        while(!aux.isEmpty()){
            st.push(aux.pop());
        }
        return p;
    }
    
    public int peek() {
        while(!st.isEmpty()){
            aux.push(st.pop());
        }
        int p = aux.peek();
        
        while(!aux.isEmpty()){
            st.push(aux.pop());
        }
        return p;
    }
    
    public boolean empty() {
        return st.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */