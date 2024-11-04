class Solution {
    public String compressedString(String word) {
        char[] charWords = word.toCharArray();
        String result = "";

        int i = 0;

        while(i < charWords.length){
            char currentChar = charWords[i]; 
            int count = 0;

            while(i < charWords.length && charWords[i] == currentChar){
                count++;
                i++;
            }

            while(count > 9){
                result += "9" + currentChar;
                count -= 9;
            }
            result += count + "" + currentChar;
        }
        return result;
    }
}