// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

class Solution {
    public void moveZeroes(int[] nums) {
        int head = 0, i=0, n = nums.length;
        for (; i<n; i++)
            if (nums[i] != 0)
                nums[head++] = nums[i];
        
        while(head<n)
            nums[head++] = 0;
    }
}