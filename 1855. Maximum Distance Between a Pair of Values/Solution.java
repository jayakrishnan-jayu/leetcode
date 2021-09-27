// You are given two non-increasing 0-indexed integer arrays nums1​​​​​​ and nums2​​​​​​.
// A pair of indices (i, j), where 0 <= i < nums1.length and 0 <= j < nums2.length, is valid if both i <= j and nums1[i] <= nums2[j]. The distance of the pair is j - i​​​​.
// Return the maximum distance of any valid pair (i, j). If there are no valid pairs, return 0.
// An array arr is non-increasing if arr[i-1] >= arr[i] for every 1 <= i < arr.length.

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0, i = 0, j = 0, nums1Size = nums1.length, nums2Size = nums2.length;
        while(j < nums2Size) {
            while(i<nums1Size && nums1[i] > nums2[j]) i++;
            if (i<nums1Size) {
                max = j-i > max ? j-i : max; 
            }
            j++;
        }
        return max;
    }
}