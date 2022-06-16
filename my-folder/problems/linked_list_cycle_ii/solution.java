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
        
    
        if(head==null) return null;
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow == fast)
            {
                 temp=slow;
                 break;
            } 
           
        }
        
         if(temp== null) return null;
        
        ListNode p1=head;
        ListNode p2=temp;
        
        while(p1!=p2)
        {
             p1=p1.next;
             p2=p2.next;
        }
        
        return p1;
            
    }
}