class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0;
        for(int num : nums){
            sum += num;
            max = max < sum ? sum : max;
            sum = sum < 0 ? 0 : sum;
        }
        return max;
    }
}