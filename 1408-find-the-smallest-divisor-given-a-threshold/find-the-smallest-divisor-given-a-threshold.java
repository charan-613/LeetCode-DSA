class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = getMax(nums);
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(isPossible(nums, threshold, mid)){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }

    private int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static boolean isPossible(int[] nums, int threshold, int k){
        for(int i = 0; i < nums.length; i++){
            int upper = nums[i] / k;
            if(nums[i] % k != 0){
                upper++;
            }
            threshold -= upper;
            if(threshold < 0){
                return false;
            }
        }
        return true;
    }
}