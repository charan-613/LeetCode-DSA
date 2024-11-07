class Solution {
    public int largestCombination(int[] candidates) {
        int[] bitCount = new int[32]; // Array to store counts of '1's at each bit position

        for (int num : candidates) {
            for (int j = 0; j < 32; j++) {
                if ((num & (1 << j)) != 0) { // Check if the j-th bit is set in num
                    bitCount[j]++;
                }
            }
        }

        // Find the maximum count in bitCount
        int maxCombination = 0;
        for (int count : bitCount) {
            maxCombination = Math.max(maxCombination, count);
        }
        return maxCombination;
    }
}
