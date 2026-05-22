class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i<k; i++){        
            while(!dq.isEmpty() && dq.peekLast() < nums[i]){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
        }

        res.add(dq.peekFirst());

        for(int i = k; i<nums.length; i++){
            if(dq.peekFirst() == nums[i-k]) dq.removeFirst();

            while(!dq.isEmpty() && dq.peekLast() < nums[i]){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
            res.add(dq.peekFirst());
        }

        int[] sol = new int[res.size()];
        for(int i = 0; i<res.size(); i++){
            sol[i] = res.get(i);
        }

        return sol;
    }
}
