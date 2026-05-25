class StockSpanner {
    Deque <Integer> st;
    Deque <Integer> aux;
    public StockSpanner() {
        st = new ArrayDeque();
        aux = new ArrayDeque();
    }
    
    public int next(int price) {
        if(st.isEmpty() || st.peek() > price){
            st.push(price);
            return 1;
        }else{
            int c = 1;
            while(!st.isEmpty() && st.peek() <= price){
                c++;
                aux.push(st.pop());
            }
            while(!aux.isEmpty()) st.push(aux.pop());
            st.push(price);
            return c;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */