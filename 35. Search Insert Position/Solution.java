// Given a sorted array of distinct integers and a target value, return the index if the target is found. 
// If not, return the index where it would be if it were inserted in order.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid, head = 0, tail = nums.length - 1;
        while(head <= tail) {
            mid = (head + tail) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target)
                tail = mid - 1;
            else
                head = mid + 1;
        }
        return head;
    }
}