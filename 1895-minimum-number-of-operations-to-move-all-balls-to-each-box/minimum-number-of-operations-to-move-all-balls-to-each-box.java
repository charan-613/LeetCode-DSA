class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];
        int leftBalls = 0, rightBalls = 0, leftMoves = 0, rightMoves = 0;

        // Initial pass to calculate the number of balls on the right side
        for (int i = 0; i < n; i++) {
            if (boxes.charAt(i) == '1') {
                rightBalls++;
                rightMoves += i;
            }
        }

        // Second pass to calculate the operations needed for each box
        for (int i = 0; i < n; i++) {
            result[i] = leftMoves + rightMoves;

            if (boxes.charAt(i) == '1') {
                leftBalls++;
                rightBalls--;
            }

            leftMoves += leftBalls;
            rightMoves -= rightBalls;
        }

        return result;
    }
}