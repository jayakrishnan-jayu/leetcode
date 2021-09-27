// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

class Solution {
    public int firstUniqChar(String s) {
        byte[] freq = new byte[26];
        int i = 0, temp;
        while (i<s.length()) {
            temp = s.charAt(i++) - 97;
            if (freq[temp] == -1)
                freq[temp] = 1;
            else if (freq[temp] == 0)
                freq[temp] = -1;
        }
        i=0;
        while(i<s.length())
            if (freq[(int)s.charAt(i++) - 97] == -1)
                return i-1;
        return -1;
    }
}