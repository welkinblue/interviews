public class Solution {
    /**
     * @param A: An array of integers
     * @return: An integer
     */
    public int firstMissingPositive(int[] A) {
        // write your code here
        if (A == null || A.length < 1) {
            return 1;
        }
        
        int i = 0;
        while (i < A.length) {
            if (A[i] == i + 1 || A[i] <= 0 || A[i] > A.length) {
                i++;
            }
            else if(A[A[i] - 1] != A[i]) {
                swap(A, i, A[i] - 1);
            }
            else {
                i++;
            }
        }

        i = 0;
        while(i < A.length && A[i] == i + 1) {
            i++;
        }

        return i + 1;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }    
}