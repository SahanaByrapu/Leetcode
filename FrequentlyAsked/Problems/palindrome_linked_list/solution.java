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
    public boolean isPalindrome(ListNode head) {

      ListNode slow=head;
      ListNode fast=head;

      while(fast.next!=null && fast.next.next!=null)
      {
         slow=slow.next;
         fast=fast.next.next;
      }  

      if(fast.next!=null)
       slow=slow.next;

       //Reversing the list from the middle element
      
      ListNode curr=slow;
      ListNode prev=null;
      while(curr!=null)
      {
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
      }

      ListNode reversed=prev;
      curr=head;
      while(curr!=null && reversed!=null)
      {
        
        if(curr.val!=reversed.val) return false;
        
        reversed=reversed.next;
        curr=curr.next;
      }
  
      return true;

    }
}