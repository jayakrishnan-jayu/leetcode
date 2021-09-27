// Given the head of a singly linked list, return the middle node of the linked list.
// If there are two middle nodes, return the second middle node.

class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode tail = head;
        while(head != null && head.next != null) {
            tail = tail.next;
            head = head.next.next;
        }
        return tail;
    }
}
