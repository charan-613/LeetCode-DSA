class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentSubarraySum = nums[i];
            for (int j = i + 1; j < nums.length && nums[j] > nums[j - 1]; j++) {
                currentSubarraySum += nums[j];
            }
            maxSum = Math.max(maxSum, currentSubarraySum);
        }
        return maxSum;
    }
}