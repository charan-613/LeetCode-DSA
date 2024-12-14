class Solution {
    public long continuousSubarrays(int[] nums) {
        long count = 0;
        int l = 0;
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        
        for (int r = 0; r < n; r++) {
            max = Math.max(max, nums[r]);
            min = Math.min(min, nums[r]);
            
            while (max - min > 2) {
                if (nums[l] == max || nums[l] == min) {
                    max = nums[l + 1];
                    min = nums[l + 1];
                    for (int i = l + 1; i <= r; i++) {
                        max = Math.max(max, nums[i]);
                        min = Math.min(min, nums[i]);
                    }
                }
                l++;
            }
            count += (r - l + 1);
        }
        return count;
    }
}
