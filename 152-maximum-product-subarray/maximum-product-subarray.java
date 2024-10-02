class Solution {
    public int maxProduct(int[] nums) {
        int max_product = nums[0], max_current = nums[0], min_current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max_current;
                max_current = min_current;
                min_current = temp;
            }
            max_current = Math.max(nums[i], max_current * nums[i]);
            min_current = Math.min(nums[i], min_current * nums[i]);
            max_product = Math.max(max_product, max_current);
        }
        return max_product;
    }
}