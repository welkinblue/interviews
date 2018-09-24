public class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if(x < 0) {
            return 0;
        }
        if(x < 2) {
            return x;
        }
        
        int lo = 1, hi = x;
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if(x / mid < mid) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }

        return hi - 1;

    }
}