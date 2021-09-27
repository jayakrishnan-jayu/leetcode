// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
// Return any array that satisfies this condition.

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length-1,temp;
        while(l<r) {
            if (nums[l]%2 > nums[r]%2) {
                temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
            if (nums[l]%2==0)
                l++;
            if (nums[r]%2==1)
                r--;
        }
        return nums;
    }
}
