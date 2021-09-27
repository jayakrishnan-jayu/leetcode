// Given an array, rotate the array to the right by k steps, where k is non-negative.

class Solution {
    private void reverse(int[] nums, int l, int r) {
        int temp;
        while(l<r) {
            temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
    
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
}