class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] arr = answerKey.toCharArray();
        int countT = 0;
        int countF = 0;
        int temp = 0;
        int n = arr.length;
        int ans = 0;
        int l = 0;

        for(int r = 0; r < n; r++){
            if(arr[r] == 'F'){
                countF++;
            }
            else{
                countT++;
            }

            while(Math.min(countF, countT) > k){
                if(arr[l] == 'F'){
                    countF--;
                }
                else{
                    countT--;
                }
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}