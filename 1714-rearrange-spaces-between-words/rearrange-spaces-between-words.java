class Solution {
    public String reorderSpaces(String text) {
        StringBuilder sb = new StringBuilder();
        int totalSpaces = 0;

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                totalSpaces++;
            }
        }

        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;

        int optimal_spaces = wordCount > 1 ? totalSpaces / (wordCount - 1) : 0;
        int trailing_spaces = wordCount > 1 ? totalSpaces % (wordCount - 1) : totalSpaces;
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) { 
                for (int j = 0; j < optimal_spaces; j++) {
                    sb.append(' ');
                }
            }
        }
        for (int i = 0; i < trailing_spaces; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }
}