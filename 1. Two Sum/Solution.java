// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int c;
        for (int i=0; i<nums.length; i++) {
            c = target-nums[i];
            if (map.containsKey(c))
                return new int[] {map.get(c), i};
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException(); 
    }
}