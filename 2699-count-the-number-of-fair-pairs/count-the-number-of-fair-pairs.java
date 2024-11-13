class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;

        for(int i = 0; i < nums.length; i++){
            int left = i + 1;
            int right = nums.length;

            int start = lowerBound(nums, left, right, lower - nums[i]);
            int end = upperBound(nums, left, right, upper - nums[i]);

            count += end - start;
        }
        return count;
    }

    public static int lowerBound(int[] nums, int left, int right, int target){
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }

    public static int upperBound(int[] nums, int left, int right, int target){
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] <= target){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}