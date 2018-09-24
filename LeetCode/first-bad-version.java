public class Solution {
    /**
     * @param n: An integer
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
        if (n < 0) {
            return -1;
        }

        int lo = 1;
        int hi = n;
        while(lo < hi) {
            int mid = lo + (hi - lo)/2;
            if(!isBadVersion(mid)){
                lo = mid + 1;
            }
            else{
                hi = mid;
            }
        }
        return hi;
    }
}