class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(isOdd(nums[i]) == isOdd(nums[i+1])){
                return false;
            }
        }
        return true;
    }
    

    public static boolean isOdd(int num){
        if(num % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }
}