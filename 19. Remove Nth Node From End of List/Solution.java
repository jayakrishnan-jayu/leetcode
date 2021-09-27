// Given the head of a linked list, remove the nth node from the end of the list and return its head.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || (head.next == null && n>0))
            return null;
        
        ListNode tail = head;
        ListNode result = head;
        
        while(n-- >0)
            head = head.next;
        if(head==null)
            return result.next;
                
        while(head!=null && head.next != null) {
            head = head.next;
            tail = tail.next;
        }
        tail.next = tail.next.next;
        return result;
    }
}