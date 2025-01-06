class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];

        for(int[] shift : shifts){
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            if(direction == 1){
                diff[start] += 1;
                diff[end + 1] -= 1;
            }
            else if(direction == 0){
                diff[start] -= 1;
                diff[end + 1] += 1;
            }
        }

        int cumulativeShift = 0;
        char[] result = s.toCharArray();

        for(int i = 0; i < n; i++){
            cumulativeShift += diff[i];
            int shiftAmount = ((result[i] - 'a') + cumulativeShift) % 26;
            if(shiftAmount < 0){
                shiftAmount += 26;
            }
            result[i] = (char) ('a' + shiftAmount);
        }
        return new String(result);
    }
}