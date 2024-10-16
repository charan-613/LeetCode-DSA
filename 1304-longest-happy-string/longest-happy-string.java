class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        
        // Array to hold the counts of 'a', 'b', and 'c'
        int[][] counts = {{a, 'a'}, {b, 'b'}, {c, 'c'}};

        while (true) {
            // Sort the array to always pick the character with the highest count
            Arrays.sort(counts, (x, y) -> y[0] - x[0]);

            boolean hasAdded = false;

            // Try to add the most frequent character
            for (int i = 0; i < 3; i++) {
                if (counts[i][0] == 0) {
                    continue; // No more of this character left
                }

                int len = sb.length();
                // Check if adding the character will create three consecutive characters
                if (len >= 2 && sb.charAt(len - 1) == counts[i][1] && sb.charAt(len - 2) == counts[i][1]) {
                    continue; // Skip adding this character to avoid "aaa", "bbb", or "ccc"
                }

                // Add the character
                sb.append((char) counts[i][1]);
                counts[i][0]--; // Decrease the count
                hasAdded = true;
                break;
            }

            if (!hasAdded) {
                // If we couldn't add any character, break the loop
                break;
            }
        }

        return sb.toString();
    }
}
