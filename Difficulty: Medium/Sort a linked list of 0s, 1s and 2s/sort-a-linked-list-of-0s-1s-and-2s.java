/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node zeroDummy=new Node(-1);
        Node oneDummy=new Node (-1);
        Node twoDummy=new Node (-1);
        
        Node zeroTail=zeroDummy;
        Node oneTail=oneDummy;
        Node twoTail=twoDummy;
        
        Node curr=head;
        
        while(curr!=null){
            if(curr.data==0){
                zeroTail.next=curr;
                zeroTail=zeroTail.next;
            }
            else if (curr.data==1){
                oneTail.next=curr;
                oneTail=oneTail.next;
            }
            else if(curr.data==2){
                twoTail.next=curr;
                twoTail=twoTail.next;
            }
            curr=curr.next;
        }
        
        zeroTail.next=oneDummy.next!=null?oneDummy.next:twoDummy.next;
        oneTail.next=twoDummy.next;
        twoTail.next=null;
        return zeroDummy.next;
        
    }
}