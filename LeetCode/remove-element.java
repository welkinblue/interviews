public class Solution {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        if (A == null || A.length < 1) {
            return 0;
        }

        int i = 0;
        for(int j = 0; j < A.length; j++) {
            if(A[j] != elem) {
                A[i] = A[j];
                i++;
            }
        }

        return i;
    }
}