import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // my linked list
        linked_list list = new linked_list();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.search(5);
        list.delLast();
        list.search(5);
        list.delLast();
        list.print();
        list.clear();
        list.print();

        // Java linked list
        LinkedList<Integer> list_java  = new LinkedList<>();
        list_java.add(1);
        list_java.add(2);
        list_java.add(3);
        list_java.add(4);
        list_java.add(5);
        list_java.indexOf(3);

    }
}
