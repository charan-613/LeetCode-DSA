class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int target = getMin(nums);
        while(l <= r){
            int mid = l + (r - l) / 2;
            
            if(nums[mid] == target){
                return nums[mid];
            }

            else if(nums[mid] >= nums[l]){
                if(nums[l] <= target && target < nums[mid]){
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            
            else{
                if(nums[mid] <= target && target < nums[r]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int getMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}