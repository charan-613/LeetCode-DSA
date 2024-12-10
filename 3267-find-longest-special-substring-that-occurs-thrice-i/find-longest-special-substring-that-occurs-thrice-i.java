class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int maxLength = -1;

        for (int len = 1; len <= n; len++) { 
            HashMap<String, Integer> freqMap = new HashMap<>();
            for (int i = 0; i + len <= n; i++) {
                String substring = s.substring(i, i + len);
                if (isSpecial(substring)) {
                    freqMap.put(substring, freqMap.getOrDefault(substring, 0) + 1);
                    if (freqMap.get(substring) >= 3) {
                        maxLength = Math.max(maxLength, len);
                    }
                }
            }
        }
        return maxLength;
    }


    public boolean isSpecial(String s) {
        char firstChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != firstChar) {
                return false;
            }
        }
        return true;
    }
}