import java.util.*;

public class basicimplementation {

    static final int size = 100;
    static int[] stack = new int[size];
    static int index = -1;

    public static void pushOperation(Scanner sc) {
        if (index == size - 1) {
            System.out.println("Stack is overflow...");
        } else {
            System.out.print("Enter any element: ");
            int element = sc.nextInt();
            index++;
            stack[index] = element;
        }
    }

    public static void popOperation() {
        if (index == -1) {
            System.out.println("Stack is empty...");
        } else {
            int n = stack[index];
            index--;
            System.out.println("Element is deleted " + n);
        }
    }

    public static void printStack() {
        if (index == -1) {
            System.out.println("Stack is empty...");
        } else {
            System.out.print("Elements of stack are: ");
            for (int i = index; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1.PUSH\n2.POP\n3.PRINT\n4.EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pushOperation(sc);
                    break;
                case 2:
                    popOperation();
                    break;
                case 3:
                    printStack();
                    break;
                case 4:
                    System.out.println("Exit the program...");
                    break;
                default:
                    System.out.println("Invalid choice...");
            }
        } while (choice != 4);
    }
}
