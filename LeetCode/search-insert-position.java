class Solution {
    public int searchInsert(int[] A, int target) {
        if(A == null || A.length == 0) {
            return 0;
        }

        int lo = 0;
        int hi = A.length - 1;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if(A[mid] == target) {
                return mid;
            }
            else if(A[mid] < target) {
                lo = mid;
            }
            else{
                hi = mid;
            }
        }
        if(A[hi] < target) {
            return hi + 1;
        }
        if(A[lo] < target) {
            return lo + 1;
        }
        
        return 0;
    }
}