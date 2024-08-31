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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode d=new ListNode(0);
       d.next=head; 
      ListNode slow=d;
        ListNode fast=d;
        
        for(int i=0;i<=n;i++){
            slow=slow.next;
        }
        
        while(slow!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        fast.next=fast.next.next;
        return d.next;
    }
}