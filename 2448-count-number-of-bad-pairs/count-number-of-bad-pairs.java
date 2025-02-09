class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        long goodPairs = 0;
        
        for (int i = 0; i < n; i++) {
            if (freq.containsKey(nums[i] - i)) {
                goodPairs += freq.get(nums[i] - i);
            }
            freq.put(nums[i] - i, freq.getOrDefault(nums[i] - i, 0) + 1);
        }
        
        long badPairs = (long) n * (n - 1) / 2 - goodPairs;
        return badPairs;
    }
}
