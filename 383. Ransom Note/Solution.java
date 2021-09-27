// Given two stings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length(), m = magazine.length(), i=0, temp;
        if (n>m)
            return false;
        int[] freq = new int[26];
        while(i<m)
            freq[magazine.charAt(i++)-97]++;
        i=0;
        while(i<n) {
            temp = ransomNote.charAt(i++)-97;
            if (freq[temp]==0)
                return false;
            freq[temp]--;
        }
        return true;
    }
}