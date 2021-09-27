// Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
// Integers in each row are sorted from left to right.
// The first integer of each row is greater than the last integer of the previous row.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length, lower=0, higher, mid;
        higher = (m*n)-1;
        while(lower<=higher) {
            mid = (lower+higher)/2;
            if (matrix[mid/m][mid%m] == target)
                return true;
            else if (matrix[mid/m][mid%m] > target)
                higher = mid -1;
            else
                lower = mid + 1;
        }
        return false;
    }
}