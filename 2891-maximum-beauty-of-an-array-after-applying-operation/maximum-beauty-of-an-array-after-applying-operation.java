class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int length = 0;
        int n = nums.length;
        for(int r = 0; r < n; r++){
            while(nums[r] - nums[l] >  2 * k){
                l++;
            }
            length = Math.max(length, r - l + 1);
        }
        return length;
    }
}