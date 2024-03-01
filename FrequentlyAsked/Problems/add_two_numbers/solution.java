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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

       ListNode dummy=new ListNode(-1); 
       ListNode res=dummy;
       int carry=0;
       while(l1!=null || l2!=null)
       {
         int p= (l1!=null)? l1.val:0;
         int q= (l2!=null)? l2.val:0;
         int val=(p+q+carry)% 10;
         carry=(p+q+carry)/10;
         ListNode node=new ListNode(val);
         System.out.println(val);
         res.next=node;
         res=res.next;
         if(l1!=null) l1=l1.next;
         if(l2!=null) l2=l2.next;
       }
      
       if(carry>0)
          res.next=new ListNode(carry);

      return dummy.next;

    }
}