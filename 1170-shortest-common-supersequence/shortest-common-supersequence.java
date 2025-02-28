class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length(), n = str2.length();
        int dp[][] = new int[m + 1][n + 1];

        for (int row = 0; row <= m; row++)
            dp[row][0] = row;

        for (int col = 0; col <= n; col++)
            dp[0][col] = col;

        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= n; col++) {
                if (str1.charAt(row - 1) == str2.charAt(col - 1))
                    dp[row][col] = dp[row - 1][col - 1] + 1;
                else
                    dp[row][col] = Math.min(dp[row - 1][col], dp[row][col - 1]) + 1;
            }
        }

        int row = m;
        int col = n;
        StringBuilder sb = new StringBuilder();

        while (row > 0 && col > 0) {
            if (str1.charAt(row - 1) == str2.charAt(col - 1)) {
                sb.append(str1.charAt(row - 1));
                row--;
                col--;
            }

            else {
                if (dp[row - 1][col] < dp[row][col - 1]) {
                    sb.append(str1.charAt(row - 1));
                    row--;
                } else {
                    sb.append(str2.charAt(col - 1));
                    col--;
                }
            }
        }

        while (row > 0) {
            sb.append(str1.charAt(row - 1));
            row--;
        }

        while (col > 0) {
            sb.append(str2.charAt(col - 1));
            col--;
        }

        return sb.reverse().toString();

    }
}