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
        
        
        if(head == null) return true;
        
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart  = reverseList(firstHalfEnd.next);
        
        ListNode curr=head;
        ListNode curr2 =secondHalfStart;
        while(curr2!=null)
        {
            if(curr.val != curr2.val)
               return false;
            curr=curr.next;
           curr2=curr2.next;
        }
        
        return true;
        
    }
    
    public ListNode endOfFirstHalf(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    
    public ListNode reverseList(ListNode head )
    {
        ListNode new_head=null;
        ListNode curr =head;
        ListNode next_node;
        
        while(curr!=null)
        {
            next_node=curr.next;
            curr.next=new_head;
            new_head=curr;
            curr=next_node;
        }
        
        return new_head;
    }
}