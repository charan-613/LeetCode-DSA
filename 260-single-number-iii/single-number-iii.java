class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] arr = new int[2];
        int index = 0;
        for(int i = 0; i < n; i++){
            if(i == n - 1 || nums[i] != nums[i + 1]){
                arr[index] += nums[i];
                index++;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}