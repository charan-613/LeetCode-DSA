class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }

        int count = 0;
        
        int totalSubsets = 1 << n;
        for (int subsetMask = 1; subsetMask < totalSubsets; subsetMask++) {
            int currentOr = 0;
            for (int i = 0; i < n; i++) {
                if ((subsetMask & (1 << i)) != 0) { 
                    currentOr |= nums[i];
                }
            }
            if (currentOr == maxOr) {
                count++;
            }
        }

        return count;
    }
}