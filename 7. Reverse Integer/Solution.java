// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
class Solution {
    public int reverse(int x) {
        int reverse = 0, temp;
        boolean isNegative = x<0;
        if (isNegative)
            x *= -1;
        while(x>0) {
            temp = reverse*10 + x%10;
            if ((temp-x%10)/10 != reverse) return 0;
            reverse = temp;
            x/=10; 
        }
        return isNegative ? -1*reverse: reverse;
    }
}