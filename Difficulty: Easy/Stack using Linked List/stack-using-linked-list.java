// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    Node top;
    int size;
    public myStack() {
        // Initialize your data members
        top=null;
        size=0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
       return size==0?true:false;
    }

    public void push(int x) {
        // Adds an element x at the rear of the stack.
        Node newNode=new Node(x);
        newNode.next=top;
        top=newNode;
        size++;
    }

    public void pop() {
               if (top == null) {
            return ; // Pop operation cannot be performed
        }
        
        Node temp = top; // Store the top temporarily
        top = top.next; // Update top to next node
        temp = null; // Delete old top node
        size--; // Decrement size

    }

    public int peek() {
        if(top==null) return -1;
        else{
            return top.data;
        }
    }

    public int size() {
        // Returns the current size of the stack.
        return size;
    }
}
