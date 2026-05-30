class Solution {
    public int sum(int[] weights){
        int sum = 0;
        for(int i : weights) sum+=i;
        return sum;
    }
    public int daysNeeded(int[] weights, int capacity){
        int days = 1;
        int loaded = 0;

        for(int i : weights){
            if(i > capacity) return Integer.MAX_VALUE;
            if(capacity-loaded-i >= 0){
                loaded += i;
            }else{
                days++;
                loaded = i;
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 1;
        int high = sum(weights);
        int mid = low + (high - low) / 2;
        int cap = Integer.MAX_VALUE;

        while(low <= high){
            if(daysNeeded(weights, mid) > days) low = mid + 1;
            else{
                cap = Math.min(cap, mid);
                high = mid - 1;
            }
            mid = low + (high - low) / 2;
        }

        System.out.println(daysNeeded(weights, cap));

        return cap;
    }
}