class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false;
        }
        if (s.length() == k) {
            return true;
        }

        int oddcount = 0;
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                oddcount++;
            }
        }
        if (oddcount <= k) {
            return true;
        }
        return false;
    }
}
