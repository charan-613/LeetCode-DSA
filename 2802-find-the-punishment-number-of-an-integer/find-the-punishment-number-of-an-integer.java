class Solution {
    public int punishmentNumber(int n) {
        int punishmentNum = 0;

        for (int currentNum = 1; currentNum <= n; currentNum++) {
            int squareNum = currentNum * currentNum;

            if (canPartition(Integer.toString(squareNum), currentNum)) {
                punishmentNum += squareNum;
            }
        }
        return punishmentNum;
    }

    public boolean canPartition(String stringNum, int target) {
        if (stringNum.isEmpty() && target == 0) {
            return true;
        }
        if (target < 0) {
            return false;
        }

        for (int i = 0; i < stringNum.length(); i++) {
            String left = stringNum.substring(0, i + 1);
            String right = stringNum.substring(i + 1);
            int leftNum = Integer.parseInt(left);

            if (canPartition(right, target - leftNum)) {
                return true;
            }
        }
        return false;
    }

}
