class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        int[][] counts = {{a, 'a'}, {b, 'b'}, {c, 'c'}};

        while (true) {
            Arrays.sort(counts, (x, y) -> y[0] - x[0]);
            boolean hasAdded = false;

            for (int i = 0; i < 3; i++) {
                if (counts[i][0] == 0) {
                    continue;
                }

                int len = sb.length();
                if (len >= 2 && sb.charAt(len - 1) == counts[i][1] && sb.charAt(len - 2) == counts[i][1]) {
                    continue;
                }

                sb.append((char) counts[i][1]);
                counts[i][0]--;
                hasAdded = true;
                break;
            }

            if (!hasAdded) {
                break;
            }
        }

        return sb.toString();
    }
}
