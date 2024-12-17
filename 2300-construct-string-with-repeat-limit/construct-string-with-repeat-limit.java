class Solution {
    public static String repeatLimitedString(String s, int repeatLimit) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        int currentChar = 25; 
        int nextChar;

        while (currentChar >= 0) {
            if (freq[currentChar] == 0) {
                currentChar--;
                continue;
            }

            int toAdd = Math.min(freq[currentChar], repeatLimit);
            for (int i = 0; i < toAdd; i++) {
                result.append((char) (currentChar + 'a'));
            }
            freq[currentChar] -= toAdd;

            if (freq[currentChar] > 0) {
                // Find the next available character to break the sequence
                nextChar = currentChar - 1;
                while (nextChar >= 0 && freq[nextChar] == 0) {
                    nextChar--;
                }

                if (nextChar < 0) {
                    break; // No smaller character left to break the sequence
                }

                result.append((char) (nextChar + 'a'));
                freq[nextChar]--;
            }
        }

        return result.toString();
    }
}
