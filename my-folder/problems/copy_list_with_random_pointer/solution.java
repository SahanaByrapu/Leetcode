/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
       Node curr=head;
       
       if(head==null) return null;
       while(curr!=null)
       {
          Node newnode= new Node(curr.val);
          Node temp=curr.next;
          curr.next=newnode;
          newnode.next=temp;
          curr=curr.next.next;
       }

       curr=head;
       while(curr!=null)
       {
           curr.next.random=(curr.random!=null)?curr.random.next:null;
           curr=curr.next.next;
       }
       
       Node curr_old=head;
       Node curr_new=head.next;
       Node head_old=head.next;
       while(curr_old!=null)
       {
           curr_old.next=curr_old.next.next;
           curr_new.next=(curr_new.next!=null)?curr_new.next.next:null;
           curr_old=curr_old.next;
           curr_new=curr_new.next;
       }


       return  head_old;



    }
}