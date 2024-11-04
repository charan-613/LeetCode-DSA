class Solution {
    public String compressedString(String word) {
        char[] charWords = word.toCharArray();
        StringBuilder result = new StringBuilder();

        int i = 0;

        while(i < charWords.length){
            char currentChar = charWords[i]; 
            int count = 0;

            while(i < charWords.length && charWords[i] == currentChar){
                count++;
                i++;
            }

            while(count > 9){
                result.append(9).append(currentChar);
                count -= 9;
            }
            result.append(count).append(currentChar);
        }
        return result.toString();
    }
}