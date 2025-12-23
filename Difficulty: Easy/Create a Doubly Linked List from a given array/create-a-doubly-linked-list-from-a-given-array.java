/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}
*/

class Solution {
    public Node createDLL(int arr[]) {
        // code here
        Node head=new Node(arr[0]);
        head.prev=null;
        Node prev=head;
        for(int i=1;i<arr.length;i++){
          Node temp=new Node(arr[i]);
          prev.next=temp;
          temp.prev=prev;
          temp.next=null;
          prev=temp;
        }
        return head;
    }
}