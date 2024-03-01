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
    public void reorderList(ListNode head) {
        
      
      ListNode fast=head.next;
      ListNode slow=head;

      while(fast!=null && fast.next!=null)
      {
          fast=fast.next.next;
          slow=slow.next;
      }

     ListNode curr=slow;
     ListNode prev=null;
      ListNode temp;
     while(curr!=null)
     {
         temp=curr.next;
         curr.next=prev;
         prev=curr;
         curr=temp;
     }

    curr=head;
    while(prev!=null && curr!=null)
    {
        ListNode temp1=curr.next;
        ListNode temp2=prev.next;
        curr.next=prev;
        prev.next=temp1;
        curr=temp1;
        prev=temp2;
    }
      
       

    }
}