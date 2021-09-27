// Given an integer x, return true if x is palindrome integer.
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int reverse=0, copy=x;
        while (x!=0) {
            reverse = reverse*10 + x%10;
            x/=10;
        }
        return reverse == copy;
    }
}