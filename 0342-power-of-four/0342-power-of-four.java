class Solution {
    public boolean isPowerOfFour(int n) {
        // A number less than 1 cannot be a power of 4
        if (n <= 0) {
            return false;
        }
        
        // Continue dividing the number by 4
        while (n % 4 == 0) {
            n /= 4;
        }
        
        // If the final value of n is 1, it's a power of 4
        return n == 1;
    }
}
