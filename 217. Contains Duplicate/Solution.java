// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet<Integer> hashSet = new HashSet<Integer>();
        // for (int x: nums) {
        //     if (hashSet.contains(x))
        //         return true;
        //     hashSet.add(x);
        // }
        // return false;
        Arrays.sort(nums);
        for (int x=1; x<nums.length; x++)
            if (nums[x] == nums[x-1]) return true;
        return false;
    }
}