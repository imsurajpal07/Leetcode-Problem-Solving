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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int maxSum = 0;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverseHead = reverseList(slow);
        ListNode firstNode = head;
        while(reverseHead != null)
        {
            maxSum = Math.max(maxSum, (firstNode.val + reverseHead.val));
            firstNode = firstNode.next;
            reverseHead = reverseHead.next;

        }
        return maxSum;
    }

    public ListNode reverseList(ListNode node)
    {
        ListNode curr = node;
        ListNode prev = null;
        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}