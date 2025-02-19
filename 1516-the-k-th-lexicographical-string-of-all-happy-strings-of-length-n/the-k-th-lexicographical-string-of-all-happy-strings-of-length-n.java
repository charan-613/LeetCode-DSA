class Solution {

    public String getHappyString(int n, int k) {
        List<String> result = new ArrayList<>();
        generateHappyStrings(n, "", result);
        
        if (k > result.size()) {
            return "";
        }
        return result.get(k - 1);
    }

    public void generateHappyStrings(int n, String current, List<String> result) {
        if (current.length() == n) {
            result.add(current); 
            return;
        }

        // Try adding each of 'a', 'b', 'c' to the current string
        for (char c : new char[] {'a', 'b', 'c'}) {
            // Ensure adjacent characters are different
            if (current.isEmpty() || current.charAt(current.length() - 1) != c) {
                generateHappyStrings(n, current + c, result);
            }
        }
    }
}
