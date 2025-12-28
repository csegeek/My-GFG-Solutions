/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/

    
class Solution{
    Node removeDuplicates(Node head){
         if (head == null || head.next == null) return head;
        Node temp=head;
        while(temp!=null &&temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
                if(temp.next!=null)temp.next.prev=temp;
            }
            else temp=temp.next;
        }
        return head;
        
    }
}
   