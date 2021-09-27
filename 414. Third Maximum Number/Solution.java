// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

class Solution {
    public int thirdMax(int[] nums) {
        Integer first = null, second = null, third = null;
        for (Integer x: nums) {
            if (x.equals(first) || x.equals(second) || x.equals(third))
                continue;
            if (first == null || x > first) {
                third = second;
                second = first;
                first = x;
            } else if (second == null || x > second ) {
                third = second;
                second = x;
            } else if (third == null || x > third) {
                third = x;
            }
        }
        return third != null ? third : first;
    }
}