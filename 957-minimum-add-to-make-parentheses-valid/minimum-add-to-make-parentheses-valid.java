class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int close = 0; 

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch); 
            } else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); 
                } else {
                    close++;
                }
            }
        }

        int open = stack.size();

        return open + close;
    }
}