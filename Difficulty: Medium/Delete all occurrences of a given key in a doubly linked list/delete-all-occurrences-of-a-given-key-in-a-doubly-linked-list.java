// User function Template for Java

/* Structure of Doubly Linked List
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
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
         
        while(head !=null && head.data==x){
            Node temp=head;
            head=head.next;
            deleteNode(temp);
        }
        
        if(head==null || head.next==null) return head;
        Node curr=head;
        while(curr !=null){
            Node next=curr.next;
            if(curr.data==x){
                deleteNode(curr);
            }
            curr=next;
        }
        return head;
        
    }
    
    private static void deleteNode(Node node){
        Node prev=node.prev;
        Node next=node.next;
        node.next=null;
        node.prev=null;
        if(prev!=null)
        prev.next=next;
        if(next!=null)
        next.prev=prev;
    }
    
}