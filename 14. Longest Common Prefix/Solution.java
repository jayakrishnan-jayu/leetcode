// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

class Solution {
    public static String longestCommonPrefix(String[] prefixes) {
        if (prefixes == null || prefixes.length == 0) return "";
        return LongestPrefix(prefixes, 0, prefixes.length - 1);
    }

    public static String LongestPrefix(String[] prefixes, int l, int r) {
        if (l == r)
            return prefixes[l];
        int mid = (l + r) / 2;
        String leftString = LongestPrefix(prefixes, l, mid);
        String rightString = LongestPrefix(prefixes, mid+1, r);
        return commonPrefix(leftString, rightString);

    }

    public static String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i=0; i<min; i++) {
            if (left.charAt(i) != right.charAt(i))
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }
   
}