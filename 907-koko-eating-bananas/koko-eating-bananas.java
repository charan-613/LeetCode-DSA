class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = getMax(piles);
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(isPossible(piles, h, mid)){
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

    public static boolean isPossible(int[] piles, int h, int k){
        for(int i = 0; i < piles.length; i++){
            int temp = piles[i] / k;
            if(piles[i] % k != 0){
                temp++;
            } 
            h -= temp;
            if(h < 0){
                return false;
            }
        }
        return true;
    }
}