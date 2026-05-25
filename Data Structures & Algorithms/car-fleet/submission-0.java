class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] aux = new int[n][2];
        for(int i = 0; i<n; i++){
            aux[i][0] = position[i];
            aux[i][1] = speed[i];
        }

        Arrays.sort(aux, (a,b)->Integer.compare(b[0], a[0]));

        Stack <Double> stack = new Stack<>();
        for(int[]p : aux){
            stack.push((double)(target - p[0])/p[1]);
            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) stack.pop();
        }
        return stack.size();
    }
}
