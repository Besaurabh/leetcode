/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       if (head == null || head.next == null) {
            return null; // No cycle if the list is empty or has only one node
        }

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect if there is a cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move slow by 1 step
            fast = fast.next.next;      // Move fast by 2 steps

            if (slow == fast) { // Cycle detected
                // Step 2: Find the start of the cycle
                slow = head; // Move slow to the head

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow; // The start of the cycle
            }
        }

        return null; // No cycle
    }
}