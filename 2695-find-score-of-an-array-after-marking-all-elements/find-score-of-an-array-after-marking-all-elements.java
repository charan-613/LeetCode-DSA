class Solution {
    public long findScore(int[] nums) {
        long score = 0;
        int n = nums.length;
        boolean[] marked = new boolean[n];

        List<int[]> sortedNums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sortedNums.add(new int[]{nums[i], i});
        }

        sortedNums.sort((a, b) -> Integer.compare(a[0], b[0]));

        for (int[] pair : sortedNums) {
            int value = pair[0];
            int index = pair[1];

            if (marked[index]) {
                continue;
            }
            score += value;

            marked[index] = true;
            if (index > 0) {
                marked[index - 1] = true;
            }
            if (index < n - 1) {
                marked[index + 1] = true;
            }
        }
        return score;
    }
}
