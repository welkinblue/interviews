public class Solution {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0;
        int hi = m * n - 1;
        while(lo < hi) {
            int mid = lo + (hi - lo)/2;
            if(matrix[mid / n][mid % n] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }

        return matrix[hi / n][hi % n] == target;
    }


}