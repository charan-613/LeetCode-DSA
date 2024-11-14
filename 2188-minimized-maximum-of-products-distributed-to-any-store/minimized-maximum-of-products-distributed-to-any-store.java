class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
       int low = 1;
        int high = max(quantities);
        int res = -1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (canWork(quantities, mid, n)){
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }

    public static boolean canWork(int[] quantities, int item, int total_stores){
        int need_stores = 0;

        for(int quantity : quantities){
            need_stores += (quantity - 1) / item + 1;
            if(need_stores > total_stores){
                return false;
            }
        }
        return true;
    }

    public static int max(int[] arr){
        int max = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}