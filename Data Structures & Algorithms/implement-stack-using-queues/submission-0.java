class MyStack {
    Deque <Integer> myStack;

    public MyStack() {
        myStack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        myStack.add(x);
    }
    
    public int pop() {
        for(int i = 0; i < myStack.size()-1; i++){
            myStack.add(myStack.poll());
        }
        return myStack.poll();
    }
    
    public int top() {
        for(int i = 0; i < myStack.size()-1; i++){
            myStack.add(myStack.poll());
        }
        int x = myStack.poll();
        myStack.add(x);
        return x;
    }
    
    public boolean empty() {
        return myStack.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */