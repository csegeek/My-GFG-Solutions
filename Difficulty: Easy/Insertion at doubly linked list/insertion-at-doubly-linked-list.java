/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
            Node temp=new Node(x);
            Node pth=head;
            int count=0;
            while(pth.next!=null){
                if(count==p) break;
                pth=pth.next;
                count++;
            }
            if(pth.next==null){
                pth.next=temp;
                temp.prev=pth;
            }
            else{
                Node prev=pth;
                Node next=pth.next;
                temp.prev=prev;
                temp.next=next;
                next.prev=temp;
                prev.next=temp;
               
            }
            return head;
    }
}