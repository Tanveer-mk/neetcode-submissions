class Solution {
    public int max(int [] nums){
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            max = max > i ? max : i; 
        }
        return max;
    }
    public int eatingTime(int[] piles, int n){
        int time = 0;
        for(int i : piles){
            time = (i % n) > 0 ? time + (i/n) + 1 : time + (i/n);
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
        int mid = low + (high-low) / 2;
        int res = Integer.MAX_VALUE;

        while(low <= high){
            if(eatingTime(piles, mid) > h) low = mid + 1;
            else {
                res = Math.min(mid, res);
                high = mid - 1;
            } 
            mid = low + (high - low) / 2;
        }

        return res;
    }
}
