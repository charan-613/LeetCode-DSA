class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int space = 0;

        for(int i = 0; i < s.length(); i++){
            if(space < spaces.length && i == spaces[space]){
                sb.append(' ');
                space++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}