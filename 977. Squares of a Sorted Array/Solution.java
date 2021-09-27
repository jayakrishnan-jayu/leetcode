// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums[0] >= 0) {
            for (int i=0; i<nums.length; i++)
                nums[i] = nums[i]*nums[i];
            return nums;
        }
        int[] result = new int[nums.length];
        int head = 0, tail = nums.length-1, i = nums.length-1;
        int a1, a2;
        while(head<=tail) {
            a1= nums[head]*nums[head];
            a2= nums[tail]*nums[tail];
            if (a1>a2) {
                result[i--] = a1;
                head++;
            } else {
                result[i--] = a2;
                tail--;
            }
        }
        System.gc();
        return result;
    }
}