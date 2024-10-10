class Solution {
    public int maxWidthRamp(int[] nums) {
        int max_width = 0; 
        int n = nums.length;
        List<Integer> indices = new ArrayList<>();
    
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }

        indices.sort((i, j) -> Integer.compare(nums[i], nums[j]));
        int min_index = n;

        for (int idx : indices) {
            max_width = Math.max(max_width, idx - min_index);
            min_index = Math.min(min_index, idx);
        }
        return max_width;
    }
}