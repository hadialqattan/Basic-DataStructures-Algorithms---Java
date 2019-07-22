public class linked_list {

    // create header node
    private node headNode = new node();
    // create last node
    private node lastNode = headNode;

    // add new node
    public void add(int value){
        // create new node
        node newNode = new node();
        newNode.value = value;
        newNode.next = null;
        // add new node to list
        lastNode.next = newNode;
        lastNode = newNode;
    }

    // delete last node
    public void delLast(){
        // set tracker at previous last node
        node tracker = headNode;
        while (tracker.next.next != null){
            tracker = tracker.next;
        }
        // delete last node
        tracker.next = null;
    }

    // search for node by value
    public void search(int value){
        // iterate over nodes
        node search = this.headNode.next;
        while (search != null){
            // check if value is found
            if(search.value == value){
                System.out.println("Number is found!");
                return;
            }
            search = search.next;
        }
        System.out.println("Number isn't found!");
    }

    // print linked list values
    public void print(){
        // iterate over nodes and print his value
        node print = this.headNode.next;
        System.out.print("[");
        while(print != null){
            if (print.next == null){
                System.out.print(print.value);
            }else{
                System.out.print(print.value + ", ");
            }
            print = print.next;
        }
        System.out.print("]\n");
    }

    // delete all list nodes
    public void clear(){
        headNode.next = null;
    }

}
