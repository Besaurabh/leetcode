class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // Needle is an empty string, return 0 as it's always found at index 0.
        }

        char first = needle.charAt(0);
        char end = needle.charAt(needle.length() - 1);

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == first && haystack.charAt(i + needle.length() - 1) == end) {
                boolean found = true;
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return i;
                }
            }
        }
        return -1;
    }
}