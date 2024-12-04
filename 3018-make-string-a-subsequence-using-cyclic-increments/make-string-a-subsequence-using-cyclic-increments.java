class Solution {

    public boolean canMakeSubsequence(String str1, String str2) {

        int pointer1 = 0;
        int pointer2 = 0;

        int str1_length = str1.length();
        int str2_length = str2.length();

        while (pointer1 < str1_length && pointer2 < str2_length) {
            if (str1.charAt(pointer1) == str2.charAt(pointer2) 
                || (str1.charAt(pointer1) == 'z' && str2.charAt(pointer2) == 'a') 
                || (str1.charAt(pointer1) + 1 == str2.charAt(pointer2))) {
                
                pointer2++;
            }
            pointer1++;
        }
        return pointer2 == str2_length;
    }
}
