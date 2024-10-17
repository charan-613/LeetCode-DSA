class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int maxIndex = digits.length - 1;
        int x = -1, y = -1;

        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[maxIndex]) {
                x = i;
                y = maxIndex;
            } else if (digits[i] > digits[maxIndex]) {
                maxIndex = i;
            }
        }

        if (x == -1) {
            return num;
        }

        char temp = digits[x];
        digits[x] = digits[y];
        digits[y] = temp;

        return Integer.parseInt(new String(digits));
    }
}
