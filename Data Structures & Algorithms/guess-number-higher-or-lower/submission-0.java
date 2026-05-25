/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lo = 1;
        int hi = n;
        int mid = lo + (hi - lo) / 2;

        int guessRes = guess(mid);

        while(lo <= hi){
            if(guessRes == 0) return mid;
            else if(guessRes == -1) hi = mid - 1;
            else lo = mid + 1;
            mid = lo + (hi - lo) / 2;
            guessRes = guess(mid);
        }

        return -1;
    }
}