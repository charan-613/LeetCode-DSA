class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] vowelFlags = new int[n];
        int[] prefixSum = new int[n];
        int[] ans = new int[queries.length];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < n; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);
            if (vowels.contains(first) && vowels.contains(last)) {
                vowelFlags[i] = 1;
            }
        }

        // Step 2: Build prefixSum array
        prefixSum[0] = vowelFlags[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + vowelFlags[i];
        }

        // Step 3: Answer each query using prefixSum
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            if (li == 0) {
                ans[i] = prefixSum[ri];
            } else {
                ans[i] = prefixSum[ri] - prefixSum[li - 1];
            }
        }
        return ans;
    }
}
