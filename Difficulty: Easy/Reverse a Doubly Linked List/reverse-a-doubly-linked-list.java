/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        
        if(head==null || head.next==null) return head;
        // code here
       Node curr=head;
       Node prev=null;
       while(curr!=null){
           prev=curr.prev;
           Node next=curr.next;
           curr.prev=next;
           curr.next=prev;
           curr=next;
       }
       return prev.prev;
    }
}