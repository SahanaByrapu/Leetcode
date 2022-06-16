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
     public ListNode reverseKlinkedlist(ListNode head, int k) {
        ListNode new_head=null;
        ListNode current=head;
        ListNode nextnode=null;
        while(k>0)
        {
            nextnode=current.next;
            current.next=new_head;
            new_head=current;
            current=nextnode;
            k--;
        }
        return new_head;
     }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode curr=head;
        ListNode ktail=null;
        
        ListNode new_head=null;
        while(curr!=null)
        {
            int count=0;
            
            curr=head;
            
            while(count < k && curr!=null )
            {
                curr=curr.next;
                count++;
            }
            
            if(count==k)
            {
           
            ListNode rev_head=reverseKlinkedlist(head,k);
            
            if(new_head == null)
                new_head = rev_head;
            
            if(ktail!=null)
                ktail.next=rev_head;
            
            ktail=head;
            head=curr;
            }
        }
        
        if(ktail !=null)
            ktail.next=head;
        
        return new_head == null ? head : new_head;
       
    }
}