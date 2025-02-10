class Solution {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (result.length() > 0 && !Character.isDigit(result.charAt(result.length() - 1))) {
                    result.deleteCharAt(result.length() - 1);  
                }
            }
            else {
                result.append(c); 
            }
        }
        
        return result.toString();
    }
}