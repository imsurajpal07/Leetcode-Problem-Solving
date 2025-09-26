/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // public ListNode reverseList(ListNode head) {
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     while (curr != null) {
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;
    // }

    //  public ListNode reverseList(ListNode head) {
    //     return reverseTailRecuursive(head, null);
    // }

    // private static ListNode reverseTailRecuursive(ListNode head, ListNode prev) {
    //     if (head == null)
    //         return prev;
    //     ListNode next = head.next;
    //     head.next = prev;
    //     return reverseTailRecuursive(next, head);
    // }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}