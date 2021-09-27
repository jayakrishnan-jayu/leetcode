// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. 
// Let these two numbers be numbers[index1] and numbers[index2] where 1 <= first < second <= numbers.length.
// Return the indices of the two numbers, index1 and index2, as an integer array [index1, index2] of length 2.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int head=0, tail=numbers.length-1;
        while(head<tail) {
            if (numbers[head] + numbers[tail] > target)
                tail--;
            else if (numbers[head] + numbers[tail] < target)
                head++;
            else 
                return new int[] {head+1, tail+1};
        }
        throw new IllegalArgumentException();
    }
}