class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int totalSum = 0;
        for (int num : nums) {
            totalSum = (totalSum + num) % p;
        }
        
        if (totalSum == 0) {
            return 0;
        }
        
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, -1);
        int prefixSum = 0;
        int result = n;
        
        for (int i = 0; i < n; i++) {
            prefixSum = (prefixSum + nums[i]) % p;
            int target = (prefixSum - totalSum + p) % p;
            
            if (prefixSumMap.containsKey(target)) {
                result = Math.min(result, i - prefixSumMap.get(target));
            }
            
            prefixSumMap.put(prefixSum, i);
        }
        
        return result == n ? -1 : result;
    }
}