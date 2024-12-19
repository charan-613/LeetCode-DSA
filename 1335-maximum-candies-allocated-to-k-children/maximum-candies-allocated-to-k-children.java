class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l = 1;
        int r = getMax(candies);
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(isPossible(candies, k, mid)){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return r;
    }

    public static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int arrs : arr){
            if(arrs > max){
                max = arrs;
            }
        }
        return max;
    }

    public static boolean isPossible(int[] candies, long children, int k){
        // int sum = 0;
        // for(int candy : candies){
        //     sum += candy; 
        // }
        // if(sum < children){
        //     return false;
        // }
        for(int i = 0; i < candies.length; i++){
            int val = candies[i];
            int temp = val / k;
            children -= temp;

            if(children <= 0){
                return true;
            }
        }
        return false;
    }
}