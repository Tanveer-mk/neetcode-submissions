class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int lo = 1;
        int hi = x;
        long mid = lo + (hi - lo) / 2;

        while(lo <= hi){
            if(mid * mid == x) return (int)mid;
            else if(mid * mid < x) lo = (int)mid + 1;
            else hi = (int)mid - 1;
            mid = lo + (hi - lo) / 2;
            if(lo > hi) mid--;
        }

        return (int)mid;
    }
}