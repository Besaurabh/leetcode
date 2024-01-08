class Solution {
    public int myAtoi(String s) {
      if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        
        s = s.trim();
        int sign = 1;
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        long result = 0; // Using long to handle potential overflow
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            // Check for overflow or underflow
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (result * sign);
}
}