class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int l = 0;
        int m = 0;
        int count = 0;
        int answer = 0;
        int n = nums.length;
        for(int r = 0; r < n; r++){
            if(nums[r] % 2 == 1){
                count++;
            }

            while(count > k){
                if(nums[l] % 2 == 1){
                    count--;
                }
                l++;
                m = l;
            }
            if(count == k){
                while(nums[m] % 2 != 1){
                    m++;
                }
                answer += m - l + 1;
            }

        }
        return answer;
    }
}