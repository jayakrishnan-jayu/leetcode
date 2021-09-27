// Given an array of integers arr, return true if and only if it is a valid mountain array.

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;
        int l=0, r= arr.length-1;
        while(l<arr.length-2 && arr[l] < arr[l+1])
            l++;
        while(r>1 && arr[r-1] > arr[r])
            r--;
        return l==r;
    }
}