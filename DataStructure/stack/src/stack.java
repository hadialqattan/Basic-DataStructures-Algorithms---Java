public class stack {

    // create first last previous last nodes
    node first;
    node last;
    public stack(){
        // create first node
        first = new node();
        first.next = null;
        last = first;
    }

    // push new value
    public void push(int value){
        // create new node and set value
        node newNode = new node();
        newNode.value = value;
        newNode.next = null;
        // add new node to the stack
        last.next = newNode;
        last = newNode;
    }

    // pop value
    public int pop(){
        // set tracker at previous last node
        node tracker = first;
        while (tracker.next.next != null){
            tracker = tracker.next;
        }
        // store last node value
        int temp = tracker.next.value;
        // delete last node
        tracker.next = null;
        return temp;
    }

}
