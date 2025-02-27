class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = arr[i];
                int b = arr[j];
                int length = 2;
                int nextElement = a + b;

                for (int k = j + 1; k < n; k++) {
                    if (arr[k] == nextElement) {
                        length++;
                        a = b;
                        b = nextElement;
                        nextElement = a + b;
                    }
                }
                maxLen = Math.max(maxLen, length);
            }
        }
        return maxLen >= 3 ? maxLen : 0;
    }
}
