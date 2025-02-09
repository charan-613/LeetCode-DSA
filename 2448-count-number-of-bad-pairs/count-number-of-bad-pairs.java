class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        long goodPairs = 0;
        
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(nums[i] - i)) {
                goodPairs += hm.get(nums[i] - i);
            }
            hm.put(nums[i] - i, hm.getOrDefault(nums[i] - i, 0) + 1);
        }
        
        long badPairs = (long) n * (n - 1) / 2 - goodPairs;
        return badPairs;
    }
}
