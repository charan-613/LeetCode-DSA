class Solution {

    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[] {first, last};
    }

    public static int findFirst(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int firstIndex = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                firstIndex = mid; 
                r = mid - 1;      
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return firstIndex;
    }

    public static int findLast(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int lastIndex = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                lastIndex = mid; 
                l = mid + 1;     
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return lastIndex;
    }
}
