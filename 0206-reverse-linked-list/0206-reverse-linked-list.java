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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;  // Save the next node
            curr.next = prev;  // Reverse the current node's pointer
            prev = curr;       // Move prev and curr one step forward
            curr = next;
        }

        // At the end of the loop, prev will be the new head of the reversed list
        return prev;
    }
}
