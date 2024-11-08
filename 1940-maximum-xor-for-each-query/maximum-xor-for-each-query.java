class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] answer = new int[n];
        int maxK = (int) Math.pow(2, maximumBit) - 1;

        int totalXor = 0;
        for (int num : nums) {
            totalXor ^= num;
        }
        for (int i = 0; i < n; i++) {
            answer[i] = totalXor ^ maxK;
            totalXor ^= nums[n - 1 - i];
        }
        return answer;
    }
}
