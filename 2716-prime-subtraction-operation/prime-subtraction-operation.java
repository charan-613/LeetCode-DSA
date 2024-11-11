public class Solution {
    public boolean primeSubOperation(int[] nums) {
        int prev = 0;
        for (int num : nums) {
            int upperBound = num - prev; 
            int largestPrime = 0;
            for (int i = upperBound - 1; i >= 2; i--) {
                if (isPrime(i)) {
                    largestPrime = i;
                    break;
                }
            }
            if (num - largestPrime <= prev) {
                return false;
            }
            prev = num - largestPrime;
        }
        return true;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int f = 2; f <= Math.sqrt(n); f++) {
            if (n % f == 0) {
                return false;
            }
        }
        return true;
    }
}
