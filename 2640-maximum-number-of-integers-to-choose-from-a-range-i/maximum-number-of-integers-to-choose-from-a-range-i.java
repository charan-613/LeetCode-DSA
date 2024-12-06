class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int count = 0;
        int sum = 0;
        int[] range = new int[n];
        for(int i = 1; i <= n; i++){
            if(!isBanned(i, banned)){
                if(sum + i > maxSum){
                    break;
                }
                sum += i;
                count++;
            }
        }
        return count;
    }

    public static boolean isBanned(int num, int[] banned){
        for(int b : banned){
            if(b == num){
                return true;
            }
        }
        return false;
    }
}