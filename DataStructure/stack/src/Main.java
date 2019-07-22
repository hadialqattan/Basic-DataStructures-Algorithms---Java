import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // my stack (FILO)
        stack myStack = new stack();
        for (int i = 1; i < 11; i++) {
            myStack.push(i);
        }
        System.out.println("______");
        for (int i = 1; i < 11; i++) {
            System.out.print("| " + myStack.pop() + " | " + "\n_____\n");
        }
        System.out.println("=======================");
        // Java stack
        Stack<Integer> Stack_java = new Stack<>();
        for (int i = 1; i < 11; i++) {
            Stack_java.push(i);
        }
        System.out.println("______");
        for (int i = 1; i < 11; i++) {
            System.out.print("| " + Stack_java.pop() + " | " + "\n_____\n");
        }
    }
}
