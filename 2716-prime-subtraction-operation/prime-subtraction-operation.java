public class Solution {
    public boolean primeSubOperation(int[] nums) {
        int prev = 0;
        for (int num : nums) {
            int upperBound = num - prev; // non-inclusive
            // Find the largest prime less than the upper bound
            int largestPrime = 0;
            for (int i = upperBound - 1; i >= 2; i--) {
                if (isPrime(i)) {
                    largestPrime = i;
                    break;
                }
            }
            // If n - largestPrime <= prev, return false
            if (num - largestPrime <= prev) {
                return false;
            }
            prev = num - largestPrime;
        }
        return true;
    }

    // Helper function to check if a number is prime
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
