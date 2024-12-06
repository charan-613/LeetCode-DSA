class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int sl = k;
        int l = 0;
        int lowest_score = Integer.MAX_VALUE;
        for(int r = 0; r < n; r++){
            if(r - l == sl){
                l++;
            }
            if(r - l + 1 == sl){
                int temp = nums[r] - nums[l];
                lowest_score = Math.min(lowest_score, temp);
            }
        }
        return lowest_score;
    }
}