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
      public ListNode findmid(ListNode head){
       ListNode slow=head;
       ListNode fast=head;
       
       while(fast!=null && fast.next!=null){
           slow=slow.next;//+1
           fast=fast.next.next;//+2
       }
       return slow;
    }
    public boolean isPalindrome(ListNode head) {
         if(head==null || head.next==null){
            return true;
        }
        //step1 find mid
        ListNode midnode=findmid(head);
        
        ListNode prev=null;
        ListNode curr=midnode;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode right=prev;
        ListNode left=head;
        //step 3- check left half and right half
        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
}