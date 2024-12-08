class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        int count = 0;
        char[] arr = s.toCharArray();
        for(int r = 0; r < n; r++){
            for(int i = l; i < r; i++){
                if(arr[i] == arr[r]){
                    l = i + 1;
                    break;
                }
            }
            count = Math.max(count, r - l + 1);
        }
        return count;
    }

}
