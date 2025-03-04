class Solution {
    public boolean checkPowersOfThree(int n) {
        for(int i = 15; i >= 0; i--){
            double x = Math.pow(3, i);
            if(x <= n){
                n -= x;
            }
            if(n == 0){
                return true;
            }
        }
        return false;
    }
}