class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                m.put(nums[i] * nums[j], m.getOrDefault(nums[i] * nums[j], 0) + 1);
            }
        }

        int ans = 0;
        
        for (int count : m.values()) {
            if(count > 1){
                int comb = (count * (count - 1)) / 2;
                ans += 8 * comb;
            }
        }
        return ans;
    }
}
