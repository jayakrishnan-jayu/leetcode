// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
// You must write an algorithm with O(log n) runtime complexity.

class Solution {
    public int search(int[] nums, int target) {
        int mid, head = 0, tail = nums.length - 1;
        while(head <= tail) {
            mid = (head + tail) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                tail = mid - 1;
            else
                head = mid + 1;
        }
        return -1;
    }
}
