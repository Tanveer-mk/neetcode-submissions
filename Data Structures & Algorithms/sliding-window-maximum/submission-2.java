class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];

        // first window
        for (int i = 0; i < k; i++) {

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        res[0] = nums[dq.peekFirst()];

        int idx = 1;

        for (int i = k; i < nums.length; i++) {

            // remove out-of-window index
            if (dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // maintain decreasing deque
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.removeLast();
            }

            dq.addLast(i);

            res[idx++] = nums[dq.peekFirst()];
        }

        return res;
    }
}