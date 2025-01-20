class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        int count = 0;
        for(int i : freq){
            if(i == 0){
                continue;
            }
            if(i % 2 == 1){
                count++;
            }
            else if(i > 0){
                count += 2;
            }
        }
        return count;
    }
}
