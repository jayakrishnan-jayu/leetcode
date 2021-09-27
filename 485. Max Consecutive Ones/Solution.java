// Given a binary array nums, return the maximum number of consecutive 1's in the array.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, result = 0;
        for (int x: nums) {
            if (x == 0)
                count = 0;
            else {
                count++;
                if (count > result)
                    result = count;
            }
        }
        return result;
        
    }
}