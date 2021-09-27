// Given an array nums of integers, return how many of them contain an even number of digits.
 
class Solution {
    public int findNumbers(int[] nums) {
        int result=0, count;
        for (int x: nums) {
            count = 0;
            while(x>0){
                count++;
                x/=10;
            }
            if (count%2 == 0)
                result++;
        }
        return result;
    }
}