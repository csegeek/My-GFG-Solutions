// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node start,end;
    int size;

    public myQueue() {
        // Initialize your data members
        start=null;
        end=null;
        size=0;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        return size==0?true:false;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
         Node temp=new Node(x);
        if(start==null){
            start=end=temp;
        }
        else{
            end.next=temp;
            end=temp;
        }
        size++;
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(start!=null){
        Node temp=start;
        start=start.next;
        temp=null;
        size--;  
        }
    
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(start==null) return -1;
        else return start.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return size;
    }
}
