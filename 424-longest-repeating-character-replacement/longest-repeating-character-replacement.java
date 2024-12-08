class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int count = 0;
        int length = 0;
        int[] freq = new int[26];
        for(int r = 0; r < n; r++){
            freq[s.charAt(r)- 'A']++;
            count = Math.max(count, freq[s.charAt(r) - 'A']);

            while((r - l + 1) - count > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            length = Math.max(length, r - l + 1);
        }
        return length;
    }
}
