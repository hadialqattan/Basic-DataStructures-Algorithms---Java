public class queue {

    // create first and last nodes
    node first;
    node last;
    public queue(){
        first = new node();
        first.next = null;
        last = first;
    }

    public void queue(int value){
        // create new node
        node newNode = new node();
        newNode.value = value;
        newNode.next = null;
        // add new node to the queue
        last.next = newNode;
        last = newNode;
    }

    public int dequeue(){
        // dequeue
        int temp = first.next.value;
        first.next = first.next.next;
        return temp;
    }
}
