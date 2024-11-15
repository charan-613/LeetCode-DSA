class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0;
        
        while (left + 1 < n && arr[left] <= arr[left + 1]) {
            left++;
        }
        
        if (isSorted(arr)) {
            return 0;
        }
        
        int right = n - 1;
        while (right - 1 >= 0 && arr[right] >= arr[right - 1]) {
            right--;
        }
        
        int minLength = Math.min(n - left - 1, right);
        
        for (int i = 0; i <= left; i++) {
            while (right < n && arr[i] > arr[right]) {
                right++;
            }
            if (right < n) {
                minLength = Math.min(minLength, right - i - 1);
            }
        }
        return minLength;
    }

    public static boolean isSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}
