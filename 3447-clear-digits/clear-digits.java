class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                if (!stack.isEmpty()) {
                    stack.pop(); 
                }
            }
            else {
                stack.push(currentChar);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}