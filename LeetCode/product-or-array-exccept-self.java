class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null) {
            return null;
        }

        int[] products = new int[nums.length];
        int left = 1;

        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                products[i] = 1;
                continue;
            }
            products[i] = left * nums[i - 1];
            left *= nums[i - 1];
        }

        int right = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                continue;
            }
            products[i] = products[i] * right * nums[i + 1];
            right *= nums[i + 1];
        }

        return products;
    }
}