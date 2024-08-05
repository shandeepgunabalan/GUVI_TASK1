package task4;
import java.util.Stack;
import java.util.Scanner;

public class IntegerStack {
    private Stack<Integer> stack;

    public IntegerStack() {
        stack = new Stack<>();
    }
    public void push(int element) {
        stack.push(element);
        System.out.println("Pushed " + element + " onto the stack.");
    }

   
    public void pop() {
        if (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println("Popped " + element + " from the stack.");
        } else {
            System.out.println("Stack is empty. Cannot pop an element.");
        }
    }

    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Push Element\n2. Pop Element\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int elementToPush = scanner.nextInt();
                    integerStack.push(elementToPush);
                    break;
                case 2:
                    integerStack.pop();
                    break;
                case 3:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}