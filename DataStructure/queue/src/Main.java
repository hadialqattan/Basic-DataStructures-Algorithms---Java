import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // my Queue (FIFO)
        queue my_Queue = new queue();
        for (int i = 1; i < 11; i++) {
            my_Queue.queue(i);
        }
        for (int i = 1; i < 11; i++) {
            System.out.print("| " + my_Queue.dequeue() + " |");
        }
        System.out.println("\n===================================================");
    }
}
