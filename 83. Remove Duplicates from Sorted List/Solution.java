// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
// Return the linked list sorted as well.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.next == null)
                break;
            if (cur.val == cur.next.val)
                cur.next = cur.next.next;
            else cur = cur.next;
        }
        return head;
    }
}