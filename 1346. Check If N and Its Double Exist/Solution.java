// Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x: arr) {
            if (set.contains(2*x) || x%2==0 && set.contains(x/2))
                return true;
            set.add(x);
        }
        return false;
    }
}