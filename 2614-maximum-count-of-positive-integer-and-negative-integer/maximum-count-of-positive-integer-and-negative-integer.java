class Solution {
    public int maximumCount(int[] nums) {
        int neg = firstIndex(nums, 0);
        int pos = nums.length - firstIndex(nums, 1);

        return Math.max(pos, neg);
    }

    public static int firstIndex(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] >= target){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
}