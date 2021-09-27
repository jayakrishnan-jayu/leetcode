// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
// Note that elements beyond the length of the original array are not written. 
// Do the above modifications to the input array in place and do not return anything.

class Solution {
    public void duplicateZeros(int[] arr) {
        int i = arr.length - 1, zeros = 0, j;
        for (int x: arr)
            if (x == 0)
                zeros++;
        j = i + zeros;
        while (i!=j) {
            insert(arr, i, j--);
            if (arr[i] == 0)
                insert(arr, i, j--);
            i--;
        }
    }
    
    private void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }
}