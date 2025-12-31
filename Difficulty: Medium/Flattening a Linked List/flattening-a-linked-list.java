/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        Node head=root;
        // code here
        if(head==null || head.next==null){
           return head; 
        }
        Node newHead=flatten(head.next);
        return merge(head,newHead);
    }
    
    
    public Node merge(Node l1,Node l2){
        Node dummyNode=new Node(-1);
        Node curr=dummyNode;
        while(l1 !=null && l2 !=null){
            if(l1.data<l2.data){
                curr.bottom=l1;
                l1=l1.bottom;
            }
            else{
                curr.bottom=l2;
                l2=l2.bottom;
            }
            curr=curr.bottom;
        }
        if(l1==null) curr.bottom=l2;
        else curr.bottom=l1;
        return dummyNode.bottom;
    }
    
}