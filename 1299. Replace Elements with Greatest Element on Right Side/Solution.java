// 
// Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
// After doing so, return the array.

class Solution {
    public int[] replaceElements(int[] arr) {
        int head = arr.length-1, tail = arr.length-1, highest = arr[arr.length-1], i, temp;
        while(head>0) {
            while(tail>0) {
                if (arr[tail]<=highest)
                    tail--;
                else
                    break;
            }
            for (i=tail+1; i<head; i++)
                arr[i] = highest;
            temp = highest;
            highest = arr[tail];
            arr[tail] = temp;
            head = tail;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}