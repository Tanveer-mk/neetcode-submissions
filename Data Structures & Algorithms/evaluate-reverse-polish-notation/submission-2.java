class Solution {
    public int evalRPN(String[] tokens) {
        Deque <Integer> ops = new ArrayDeque <>();
        HashSet<String> operatorSet = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

        for(String op : tokens){
            if(operatorSet.contains(op)){
                int y = ops.pop();
                if(op.equals("+"))  ops.push(ops.pop() + y);
                else if(op.equals("-"))  ops.push(ops.pop() - y);
                else if(op.equals("*"))  ops.push(ops.pop() * y);
                else if(op.equals("/"))  ops.push(ops.pop() / y);
            }else{
                ops.push(Integer.parseInt(op));
            }
            System.out.println(ops);
        }

        return ops.peek();
    }
}
