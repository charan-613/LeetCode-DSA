class Solution {
    public int maxUniqueSplit(String s) {
        HashSet<String> uniqueSubstrings = new HashSet<>();
        return backtrack(s, 0, "", uniqueSubstrings);
    }

    public static int backtrack(String s, int start, String currentSubstring, HashSet<String> uniqueSubstrings) {
        if (start == s.length()) {
            return 0;
        }

        int maxCount = 0;
        StringBuilder current = new StringBuilder();

        for (int i = start; i < s.length(); i++) {
            current.append(s.charAt(i));
            String candidate = current.toString();
            
            if (!uniqueSubstrings.contains(candidate)) {
                uniqueSubstrings.add(candidate);
                maxCount = Math.max(maxCount, 1 + backtrack(s, i + 1, "", uniqueSubstrings));
                uniqueSubstrings.remove(candidate);
            }
        }

        return maxCount;
    }
}