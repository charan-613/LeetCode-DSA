class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for(int r = 0; r < n; r++){
            sum += nums[r];

            while(sum >= target){
                System.out.println(sum + " " + (r- l + 1));
                minLength = Math.min(minLength, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return minLength;
        }
    }
}