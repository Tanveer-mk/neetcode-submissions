class Solution {
    public int evalRPN(String[] tokens) {
        Deque <Integer> ops = new ArrayDeque <>();

        for(String op : tokens){
            if(op.equals("+")){
                int y = ops.pop();
                int x = ops.pop();
                ops.push(x + y);
            } else if(op.equals("-")){
                int y = ops.pop();
                int x = ops.pop();
                ops.push(x - y);
            } else if(op.equals("*")){
                int y = ops.pop();
                int x = ops.pop();
                ops.push(x * y);
            } else if(op.equals("/")){
                int y = ops.pop();
                int x = ops.pop();
                ops.push(x / y);
            } else ops.push(Integer.parseInt(op));
            
        }

        return ops.peek();
    }
}
