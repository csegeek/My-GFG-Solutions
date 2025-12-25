/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
          Node slow=head;
          Node fast=head;
          int count =0;
        while(fast!=null&&fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
            if(slow==fast){
              slow=head;
              while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
              }
              fast=fast.next;
              count=1;
              while(slow!=fast){
                  count++;
                  fast=fast.next;
              }
              return count;
            }
        
        }
        return 0;
    }
}