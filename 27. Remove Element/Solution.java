// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int x: nums)
            if (x != val)
                nums[index++] = x;
        return index;
    }
}