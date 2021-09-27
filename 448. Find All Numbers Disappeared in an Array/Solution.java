// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int temp;
        for (int i=0; i<nums.length;  i++){
            temp = Math.abs(nums[i]);
            nums[temp-1] = -(Math.abs(nums[temp-1]));
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0)
                result.add(i+1);
        }
        return result;
    }
}