// Given the head of a singly linked list, reverse the list, and return the reversed list.

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode mid = head;
        ListNode fast = head.next;
        while(fast != null) {
            mid.next = prev;
            prev = mid;
            mid = fast;
            fast = fast.next;
        }
        mid.next = prev;
        System.gc();
        return mid;
    }
}