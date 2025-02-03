class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int longest= 1;
        int strictly_increasing = 1;
        int strictly_decreasing = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1]){
                strictly_increasing++;
            }
            else{
                strictly_increasing = 1;
            }
            if(nums[i] < nums[i - 1]){
                strictly_decreasing++;
            }
            else{
                strictly_decreasing = 1;
            }
            longest = Math.max(longest, strictly_increasing);
            longest = Math.max(longest, strictly_decreasing);
        }
        return longest;
    }
}