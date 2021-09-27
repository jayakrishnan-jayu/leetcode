// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        int i=0, n = s.length(), m = t.length(), temp;
        if (n!=m)
            return false;
        while(i<n)
            freq[s.charAt(i++)-97]++;
        i=0;
        while(i<m) {
            temp = t.charAt(i++)-97;
            if (freq[temp] == 0)
                return false;
            freq[temp]--;
        }
        return true;
    }
}