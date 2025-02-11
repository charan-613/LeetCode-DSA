class Solution {
    public boolean rotateString(String s, String goal) {
        boolean ans = false;
        for(int i = 0; i < s.length(); i++){
            String op = s.substring(i) + s.substring(0, i);
            if(op.equals(goal)){
                ans = true;
                break;
            }
        }
        return ans; 
    }
}