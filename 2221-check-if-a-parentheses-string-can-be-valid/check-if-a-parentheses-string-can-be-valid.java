class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        
        if(n != locked.length() || n % 2 != 0){
            return false;
        }

        int openCount = 0;        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '(' || locked.charAt(i) == '0'){
                openCount++;
            }
            else{
                openCount--;
            }
            if(openCount < 0){
                return false;
            }
        }

        int closeCount = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ')' || locked.charAt(i) == '0') {
                closeCount++;
            }
            else{
                closeCount--;
            }
            if (closeCount < 0) {
                return false;
            }
        }
        return true;
    }
}