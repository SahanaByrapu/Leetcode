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

    public ListNode reverseLinkedList(ListNode pointer ,int k)
    {
        ListNode prev=null;

        while(k!=0)
        {
            ListNode temp=pointer.next;
            pointer.next=prev;
            prev=pointer;
            pointer=temp;

            k--;
        }

        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
      
      ListNode ptr=head;
      ListNode ktail=null;
     
      ListNode result=null;
      while(ptr!=null)
      {
         int count=0;
         ptr=head;
         while(count!=k && ptr!=null)
         {
           ptr=ptr.next;
           count++;
         }
         if(count==k)
         {
            ListNode revhead=reverseLinkedList(head,count);


            if(result==null)
              result=revhead;

            if(ktail!=null)
              ktail.next=revhead;

            ktail=head;
            head=ptr;
         }
 
       }

      if(ktail!=null)
        ktail.next=head;


      return result==null? head : result;
        
    }
}