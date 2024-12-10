class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0;
        int count = 0;
        int l = 0;
        int n = nums.length;
        for(int r = 0; r < n; r++){
            sum += nums[r];

            while(l < r && sum > goal){
                sum -= nums[l];
                l++;
            }

            if(sum == goal){
                count++;
                int m = l;

                while(m < r && nums[m] == 0){
                    count++;
                    m++;
                }
            }
        }
        return count;
    }
}