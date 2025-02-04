class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int currentSubarraySum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]){
                currentSubarraySum += nums[i];
            }
            else{
                maxSum = Math.max(maxSum, currentSubarraySum);
                currentSubarraySum = nums[i];
            }
        }
        maxSum = Math.max(maxSum, currentSubarraySum);
        return maxSum;
    }
}