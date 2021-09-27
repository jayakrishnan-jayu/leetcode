// Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
// You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. 
// You should minimize the number of calls to the API.

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int mid, head = 1, tail = n;
        while (head < tail) {
            mid = head / 2 + tail / 2;
            if (isBadVersion(mid))
                tail = mid;
            else
                head = mid + 1;
        }
        return head;
    }
}
