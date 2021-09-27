// Write a function that reverses a string. The input string is given as an array of characters s.

class Solution {
    public void reverseString(char[] s) {
        int i=0, j=s.length-1;
        char c;
        while(i<j) {
            c = s[i];
            s[i++] = s[j];
            s[j--] = c;
        }
    }
}