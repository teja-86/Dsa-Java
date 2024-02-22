class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // Empty needle is always found at index 0.
        }

        int i = 0;
        int j = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                if (j == needle.length()) {
                    return i - j; // Match found, return the starting index.
                }
            } else {
                i = i - j + 1; // Move to the next position in haystack.
                j = 0; // Reset the needle pointer.
            }
        }

        return -1; // Needle not found in haystack.
    }
}
