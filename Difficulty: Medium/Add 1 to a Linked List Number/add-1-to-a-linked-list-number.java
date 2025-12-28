/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
        Node reversedHead=reverseList(head);
        Node curr=reversedHead;
        int carry=1;
        
        while(curr!=null && carry>0){
            int sum=curr.data+carry;
            curr.data=sum%10;
            carry=sum/10;
            if(curr.next==null && carry>0){
                curr.next=new Node(carry);
                carry=0;
            }
           curr=curr.next;
        }
        return reverseList(reversedHead);
    }
    
    private Node reverseList(Node head){
        if(head==null || head.next==null) return head;
        Node curr=head;
        Node newNode=reverseList(curr.next);
        curr.next.next=curr;
        curr.next=null;
        return newNode;
    }
    
}