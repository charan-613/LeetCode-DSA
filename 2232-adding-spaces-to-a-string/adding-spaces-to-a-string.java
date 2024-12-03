class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;

        while(left < s.length()){
            if(right < spaces.length && left == spaces[right]){
                sb.append(" ");
                right++;
            }
            sb.append(s.charAt(left));
            left++;
        }
        return sb.toString();
    }
}